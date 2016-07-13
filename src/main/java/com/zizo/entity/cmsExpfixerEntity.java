package com.zizo.entity;

import javax.persistence.*;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "expfixer", schema = "cms", catalog = "")
public class cmsExpfixerEntity {
    private int zizoIndex;
    private int expIndex;
    private int userIndex;
    private int fix;
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
    @Column(name = "UserIndex", nullable = false)
    public int getUserIndex() {
        return userIndex;
    }

    public void setUserIndex(int userIndex) {
        this.userIndex = userIndex;
    }

    @Basic
    @Column(name = "Fix", nullable = false)
    public int getFix() {
        return fix;
    }

    public void setFix(int fix) {
        this.fix = fix;
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

        cmsExpfixerEntity that = (cmsExpfixerEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (expIndex != that.expIndex) return false;
        if (userIndex != that.userIndex) return false;
        if (fix != that.fix) return false;
        if (typeIndex != that.typeIndex) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zizoIndex;
        result = 31 * result + expIndex;
        result = 31 * result + userIndex;
        result = 31 * result + fix;
        result = 31 * result + typeIndex;
        return result;
    }
}
