package com.zizo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "travel", schema = "cms", catalog = "")
public class cmsTravelEntity {
    private int zizoIndex;
    private int userIndex;
    private Date startTime;
    private Date endTime;
    private Timestamp time;
    private int ticket;
    private String origin;
    private String destination;
    private BigDecimal transportation;
    private BigDecimal accommodation;
    private BigDecimal communication;
    private BigDecimal otherFee;
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
    @Column(name = "StartTime", nullable = false)
    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "EndTime", nullable = false)
    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
    @Column(name = "Ticket", nullable = false)
    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
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
    @Column(name = "Transportation", nullable = false, precision = 2)
    public BigDecimal getTransportation() {
        return transportation;
    }

    public void setTransportation(BigDecimal transportation) {
        this.transportation = transportation;
    }

    @Basic
    @Column(name = "Accommodation", nullable = false, precision = 2)
    public BigDecimal getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(BigDecimal accommodation) {
        this.accommodation = accommodation;
    }

    @Basic
    @Column(name = "Communication", nullable = false, precision = 2)
    public BigDecimal getCommunication() {
        return communication;
    }

    public void setCommunication(BigDecimal communication) {
        this.communication = communication;
    }

    @Basic
    @Column(name = "OtherFee", nullable = false, precision = 2)
    public BigDecimal getOtherFee() {
        return otherFee;
    }

    public void setOtherFee(BigDecimal otherFee) {
        this.otherFee = otherFee;
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

        cmsTravelEntity that = (cmsTravelEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (userIndex != that.userIndex) return false;
        if (ticket != that.ticket) return false;
        if (orgIndex != that.orgIndex) return false;
        if (state != that.state) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (origin != null ? !origin.equals(that.origin) : that.origin != null) return false;
        if (destination != null ? !destination.equals(that.destination) : that.destination != null) return false;
        if (transportation != null ? !transportation.equals(that.transportation) : that.transportation != null)
            return false;
        if (accommodation != null ? !accommodation.equals(that.accommodation) : that.accommodation != null)
            return false;
        if (communication != null ? !communication.equals(that.communication) : that.communication != null)
            return false;
        if (otherFee != null ? !otherFee.equals(that.otherFee) : that.otherFee != null) return false;
        if (arbitralIndex != null ? !arbitralIndex.equals(that.arbitralIndex) : that.arbitralIndex != null)
            return false;
        if (note != null ? !note.equals(that.note) : that.note != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zizoIndex;
        result = 31 * result + userIndex;
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + ticket;
        result = 31 * result + (origin != null ? origin.hashCode() : 0);
        result = 31 * result + (destination != null ? destination.hashCode() : 0);
        result = 31 * result + (transportation != null ? transportation.hashCode() : 0);
        result = 31 * result + (accommodation != null ? accommodation.hashCode() : 0);
        result = 31 * result + (communication != null ? communication.hashCode() : 0);
        result = 31 * result + (otherFee != null ? otherFee.hashCode() : 0);
        result = 31 * result + orgIndex;
        result = 31 * result + (arbitralIndex != null ? arbitralIndex.hashCode() : 0);
        result = 31 * result + (note != null ? note.hashCode() : 0);
        result = 31 * result + (state ? 1 : 0);
        return result;
    }
}
