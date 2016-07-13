package com.zizo.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "feedback", schema = "cms", catalog = "")
public class cmsFeedbackEntity {
    private int zizoIndex;
    private int userIndex;
    private Timestamp time;
    private String content;
    private boolean state;

    @Id
    @Column(name = "ZIZOIndex", nullable = false)
    public int getZizoIndex() {
        return zizoIndex;
    }

    public void setZizoIndex(int zizoIndex) {
        this.zizoIndex = zizoIndex;
    }

    @Basic
    @Column(name = "UserIndex", nullable = false)
    public int getUserIndex() {
        return userIndex;
    }

    public void setUserIndex(int userIndex) {
        this.userIndex = userIndex;
    }

    @Basic
    @Column(name = "Time", nullable = false)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "Content", nullable = false, length = 1000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "State", nullable = false)
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        cmsFeedbackEntity that = (cmsFeedbackEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (userIndex != that.userIndex) return false;
        if (state != that.state) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zizoIndex;
        result = 31 * result + userIndex;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (state ? 1 : 0);
        return result;
    }
}
