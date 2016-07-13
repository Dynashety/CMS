package com.zizo.entity;

import javax.persistence.*;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "permission", schema = "cms", catalog = "")
public class cmsPermissionEntity {
    private int zizoIndex;
    private String name;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        cmsPermissionEntity that = (cmsPermissionEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zizoIndex;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
