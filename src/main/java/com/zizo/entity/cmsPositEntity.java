package com.zizo.entity;

import javax.persistence.*;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "posit", schema = "cms", catalog = "")
public class cmsPositEntity {
    private int zizoIndex;
    private String name;
    private int orgIndex;

    @Id
    @Column(name = "ZIZOIndex", nullable = false)
    public int getZizoIndex() {
        return zizoIndex;
    }

    public void setZizoIndex(int zizoIndex) {
        this.zizoIndex = zizoIndex;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 15)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "OrgIndex", nullable = false)
    public int getOrgIndex() {
        return orgIndex;
    }

    public void setOrgIndex(int orgIndex) {
        this.orgIndex = orgIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        cmsPositEntity that = (cmsPositEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (orgIndex != that.orgIndex) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zizoIndex;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + orgIndex;
        return result;
    }
}
