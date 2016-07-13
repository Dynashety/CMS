package com.zizo.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "monthly", schema = "cms", catalog = "")
public class cmsMonthlyEntity {
    private int zizoIndex;
    private int expIndex;
    private Integer year;
    private Integer month;
    private BigDecimal amount;
    private int ticket;
    private int typeIndex;

    @Id
    @Column(name = "ZIZOIndex", nullable = false)
    public int getZizoIndex() {
        return zizoIndex;
    }

    public void setZizoIndex(int zizoIndex) {
        this.zizoIndex = zizoIndex;
    }

    @Basic
    @Column(name = "ExpIndex", nullable = false)
    public int getExpIndex() {
        return expIndex;
    }

    public void setExpIndex(int expIndex) {
        this.expIndex = expIndex;
    }

    @Basic
    @Column(name = "Year", nullable = true)
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Basic
    @Column(name = "Month", nullable = true)
    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
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
    @Column(name = "Ticket", nullable = false)
    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    @Basic
    @Column(name = "TypeIndex", nullable = false)
    public int getTypeIndex() {
        return typeIndex;
    }

    public void setTypeIndex(int typeIndex) {
        this.typeIndex = typeIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        cmsMonthlyEntity that = (cmsMonthlyEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (expIndex != that.expIndex) return false;
        if (ticket != that.ticket) return false;
        if (typeIndex != that.typeIndex) return false;
        if (year != null ? !year.equals(that.year) : that.year != null) return false;
        if (month != null ? !month.equals(that.month) : that.month != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zizoIndex;
        result = 31 * result + expIndex;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (month != null ? month.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + ticket;
        result = 31 * result + typeIndex;
        return result;
    }
}
