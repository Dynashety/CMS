package com.zizo.entity;

import javax.persistence.*;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "roleperm", schema = "cms", catalog = "")
public class cmsRolepermEntity {
    private int zizoIndex;
    private int roleIndex;
    private int permIndex;

    @Id
    @Column(name = "ZIZOIndex", nullable = false)
    public int getZizoIndex() {
        return zizoIndex;
    }

    public void setZizoIndex(int zizoIndex) {
        this.zizoIndex = zizoIndex;
    }

    @Basic
    @Column(name = "RoleIndex", nullable = false)
    public int getRoleIndex() {
        return roleIndex;
    }

    public void setRoleIndex(int roleIndex) {
        this.roleIndex = roleIndex;
    }

    @Basic
    @Column(name = "PermIndex", nullable = false)
    public int getPermIndex() {
        return permIndex;
    }

    public void setPermIndex(int permIndex) {
        this.permIndex = permIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        cmsRolepermEntity that = (cmsRolepermEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (roleIndex != that.roleIndex) return false;
        if (permIndex != that.permIndex) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zizoIndex;
        result = 31 * result + roleIndex;
        result = 31 * result + permIndex;
        return result;
    }
}
