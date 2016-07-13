package com.zizo.entity;

import javax.persistence.*;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "organization", schema = "cms", catalog = "")
public class cmsOrganizationEntity {
    private int zizoIndex;
    private String name;
    private Integer orgIndex;
    private String iden;

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
    @Column(name = "OrgIndex", nullable = true)
    public Integer getOrgIndex() {
        return orgIndex;
    }

    public void setOrgIndex(Integer orgIndex) {
        this.orgIndex = orgIndex;
    }

    @Basic
    @Column(name = "Iden", nullable = true, length = 20)
    public String getIden() {
        return iden;
    }

    public void setIden(String iden) {
        this.iden = iden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        cmsOrganizationEntity that = (cmsOrganizationEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (orgIndex != null ? !orgIndex.equals(that.orgIndex) : that.orgIndex != null) return false;
        if (iden != null ? !iden.equals(that.iden) : that.iden != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zizoIndex;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (orgIndex != null ? orgIndex.hashCode() : 0);
        result = 31 * result + (iden != null ? iden.hashCode() : 0);
        return result;
    }
}
