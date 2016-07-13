package com.zizo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "cashadvance", schema = "cms", catalog = "")
public class cmsCashadvanceEntity {
    private int zizoIndex;
    private int userIndex;
    private Date date;
    private Timestamp time;
    private BigDecimal amount;
    private String origin;
    private String destination;
    private int numOfDays;
    private int peer;
    private int trafficIndex;
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
    @Column(name = "Amount", nullable = false, precision = 2)
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "Origin", nullable = false, length = 50)
    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Basic
    @Column(name = "Destination", nullable = false, length = 50)
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Basic
    @Column(name = "NumOfDays", nullable = false)
    public int getNumOfDays() {
        return numOfDays;
    }

    public void setNumOfDays(int numOfDays) {
        this.numOfDays = numOfDays;
    }

    @Basic
    @Column(name = "Peer", nullable = false)
    public int getPeer() {
        return peer;
    }

    public void setPeer(int peer) {
        this.peer = peer;
    }

    @Basic
    @Column(name = "TrafficIndex", nullable = false)
    public int getTrafficIndex() {
        return trafficIndex;
    }

    public void setTrafficIndex(int trafficIndex) {
        this.trafficIndex = trafficIndex;
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

        cmsCashadvanceEntity that = (cmsCashadvanceEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (userIndex != that.userIndex) return false;
        if (numOfDays != that.numOfDays) return false;
        if (peer != that.peer) return false;
        if (trafficIndex != that.trafficIndex) return false;
        if (orgIndex != that.orgIndex) return false;
        if (state != that.state) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (origin != null ? !origin.equals(that.origin) : that.origin != null) return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;
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
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (origin != null ? origin.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + numOfDays;
        result = 31 * result + peer;
        result = 31 * result + trafficIndex;
        result = 31 * result + orgIndex;
        result = 31 * result + (arbitralIndex != null ? arbitralIndex.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (state ? 1 : 0);
        return result;
    }
}
