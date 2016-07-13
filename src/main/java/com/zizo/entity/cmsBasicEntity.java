package com.zizo.entity;

import javax.persistence.*;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "basic", schema = "cms", catalog = "")
public class cmsBasicEntity {
    private int zizoIndex;
    private String name;
    private int type;

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
    @Column(name = "Type", nullable = false)
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        cmsBasicEntity that = (cmsBasicEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (type != that.type) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zizoIndex;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + type;
        return result;
    }
}
