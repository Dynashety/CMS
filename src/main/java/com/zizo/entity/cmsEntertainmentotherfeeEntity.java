package com.zizo.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "entertainmentotherfee", schema = "cms", catalog = "")
public class cmsEntertainmentotherfeeEntity {
    private int zizoIndex;
    private int userIndex;
    private Date date;
    private Timestamp time;
    private String place;
    private int costIndex;
    private int orgIndex;
    private Integer arbitralIndex;
    private String note;
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
    @Column(name = "Date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
    @Column(name = "Place", nullable = false, length = 50)
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Basic
    @Column(name = "CostIndex", nullable = false)
    public int getCostIndex() {
        return costIndex;
    }

    public void setCostIndex(int costIndex) {
        this.costIndex = costIndex;
    }

    @Basic
    @Column(name = "OrgIndex", nullable = false)
    public int getOrgIndex() {
        return orgIndex;
    }

    public void setOrgIndex(int orgIndex) {
        this.orgIndex = orgIndex;
    }

    @Basic
    @Column(name = "ArbitralIndex", nullable = true)
    public Integer getArbitralIndex() {
        return arbitralIndex;
    }

    public void setArbitralIndex(Integer arbitralIndex) {
        this.arbitralIndex = arbitralIndex;
    }

    @Basic
    @Column(name = "Note", nullable = true, length = 200)
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

        cmsEntertainmentotherfeeEntity that = (cmsEntertainmentotherfeeEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (userIndex != that.userIndex) return false;
        if (costIndex != that.costIndex) return false;
        if (orgIndex != that.orgIndex) return false;
        if (state != that.state) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (place != null ? !place.equals(that.place) : that.place != null) return false;
        if (arbitralIndex != null ? !arbitralIndex.equals(that.arbitralIndex) : that.arbitralIndex != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zizoIndex;
        result = 31 * result + userIndex;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (place != null ? place.hashCode() : 0);
        result = 31 * result + costIndex;
        result = 31 * result + orgIndex;
        result = 31 * result + (arbitralIndex != null ? arbitralIndex.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (state ? 1 : 0);
        return result;
    }
}
