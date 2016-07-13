package com.zizo.entity;

import javax.persistence.*;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "userrole", schema = "cms", catalog = "")
public class cmsUserroleEntity {
    private int zizoIndex;
    private int userIndex;
    private int roleIndex;

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
    @Column(name = "RoleIndex", nullable = false)
    public int getRoleIndex() {
        return roleIndex;
    }

    public void setRoleIndex(int roleIndex) {
        this.roleIndex = roleIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        cmsUserroleEntity that = (cmsUserroleEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (userIndex != that.userIndex) return false;
        if (roleIndex != that.roleIndex) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zizoIndex;
        result = 31 * result + userIndex;
        result = 31 * result + roleIndex;
        return result;
    }
}
