package com.zizo.dynashety;

import com.zizo.object.Record;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by dengy on 2016/6/29.
 */
public class FFmpeg {
    private String ffmpegPath;
    private static final String FILE_SEPARATOR = File.separator;
    private static FFmpeg self = new FFmpeg();

    private FFmpeg() {
    }

    public static FFmpeg me() {
        return self;
    }

    public FFmpeg init(String path) {
        this.ffmpegPath = path;
        return this;
    }

    private static boolean isSurpportedType(String type) {
        Pattern pattern = Pattern.compile(
                "(asx|asf|mpg|wmv|3gp|mp4|mov|avi|flv){1}$",
                Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(type);
        return matcher.find();
    }

    public Record captureFrame(File sourceFile, String destination) {
        return captureFirstFrame(sourceFile, destination, "jpg");
    }

    private Record captureFirstFrame(File sourceFile, String destination, String surfix) {
        String fileName = sourceFile.getName();
        /*
        String surffix = fileName.substring(fileName.lastIndexOf(".") + 1);
        if (!isSurpportedType(surffix))
            throw new RuntimeException("unsurpported file type " + surffix);
        */
        List<String> cmd = new LinkedList<String>();
        cmd.add(ffmpegPath);
        cmd.add("-i");
        cmd.add(sourceFile.getAbsolutePath());
        cmd.add("-y");
        cmd.add("-f");
        cmd.add("image2");
        cmd.add("-ss");
        cmd.add("1");
        cmd.add("-t");
        cmd.add("0.001");
        cmd.add("-s");
        cmd.add("320x240");
        cmd.add(destination + FILE_SEPARATOR + fileName);
        //cmd.add(destination + FILE_SEPARATOR + fileName.substring(0, fileName.lastIndexOf(".")) + "." + surfix);
        return execCmd(cmd);
    }

    private Record execCmd(List<String> cmd) {
        Record out = null;
        final ProcessBuilder pb = new ProcessBuilder();
        pb.redirectErrorStream(true);
        pb.command(cmd);
        try {
            final Process p = pb.start();
            InputStream in = p.getInputStream();
            out = pattInfo(in);
            // 开启单独的线程来处理输入和输出流，避免缓冲区满导致线程阻塞.
            try {
                p.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
            p.getErrorStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out;
    }

    // 负责从返回的内容中解析

    /**
     * Input #0, avi, from 'c:\join.avi': Duration: 00:00:10.68(时长), start:
     * 0.000000(开始时间), bitrate: 166 kb/s(码率) Stream #0:0: Video: msrle
     * ([1][0][0][0] / 0x0001)(编码格式), pal8(视频格式), 165x97(分辨率), 33.33 tbr, 33.33
     * tbn, 33.33 tbc Metadata: title : AVI6700.tmp.avi Video #1
     */
    public Record pattInfo(InputStream is) {
        String info = read(is);
        Record out = new Record();
        String regexDuration = "Duration: (.*?), start: (.*?), bitrate: (\\d*) kb\\/s";
        Pattern pattern = Pattern.compile(regexDuration);
        Matcher m = pattern.matcher(info);
        if (m.find()) {
            out.set("timelen", getTimelen(m.group(1))).set("begintime", m.group(2)).set("kb", m.group(3) + "kb/s");
        }
        return out;
    }

    // 负责从返回信息中读取内容
    private String read(InputStream is) {
        BufferedReader br = null;
        StringBuffer sb = new StringBuffer();
        try {
            br = new BufferedReader(new InputStreamReader(is), 500);
            String line = "";
            while ((line = br.readLine()) != null) {
                // System.out.println(line);
                sb.append(line);
            }
            br.close();
        } catch (Exception e) {
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (Exception e) {
            }
        }
        return sb.toString();
    }

    //格式:"00:00:10.68"
    private int getTimelen(String timelen) {
        int min = 0;
        String strs[] = timelen.split(":");
        if (strs[0].compareTo("0") > 0) {
            min += Integer.valueOf(strs[0]) * 60 * 60;//秒
        }
        if (strs[1].compareTo("0") > 0) {
            min += Integer.valueOf(strs[1]) * 60;
        }
        if (strs[2].compareTo("0") > 0) {
            min += Math.round(Float.valueOf(strs[2]));
        }
        return min;
    }

    public static String secToTime(int time) {
        String timeStr = null;
        int hour = 0;
        int minute = 0;
        int second = 0;
        if (time <= 0)
            return "00:00";
        else {
            minute = time / 60;
            if (minute < 60) {
                second = time % 60;
                timeStr = unitFormat(minute) + ":" + unitFormat(second);
            } else {
                hour = minute / 60;
                if (hour > 99)
                    return "99:59:59";
                minute = minute % 60;
                second = time - hour * 3600 - minute * 60;
                timeStr = unitFormat(hour) + ":" + unitFormat(minute) + ":" + unitFormat(second);
            }
        }
        return timeStr;
    }

    public static String unitFormat(int i) {
        String retStr = null;
        if (i >= 0 && i < 10)
            retStr = "0" + Integer.toString(i);
        else
            retStr = "" + i;
        return retStr;
    }
}