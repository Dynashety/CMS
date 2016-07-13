package com.zizo.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by dengy on 2016/7/12.
 */
@Entity
@Table(name = "user", schema = "cms", catalog = "")
public class cmsUserEntity {
    private int zizoIndex;
    private String id;
    private String pw;
    private String name;
    private int deptIndex;
    private int workIndex;
    private Date induction;
    private Date positive;
    private boolean sex;
    private Integer maritalIndex;
    private Date birth;
    private String tel;
    private String phone;
    private String qq;
    private String wx;
    private String email;
    private String postal;
    private String addr;
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
    @Column(name = "ID", nullable = false, length = 7)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PW", nullable = false, length = 32)
    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
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
    @Column(name = "DeptIndex", nullable = false)
    public int getDeptIndex() {
        return deptIndex;
    }

    public void setDeptIndex(int deptIndex) {
        this.deptIndex = deptIndex;
    }

    @Basic
    @Column(name = "WorkIndex", nullable = false)
    public int getWorkIndex() {
        return workIndex;
    }

    public void setWorkIndex(int workIndex) {
        this.workIndex = workIndex;
    }

    @Basic
    @Column(name = "Induction", nullable = true)
    public Date getInduction() {
        return induction;
    }

    public void setInduction(Date induction) {
        this.induction = induction;
    }

    @Basic
    @Column(name = "Positive", nullable = true)
    public Date getPositive() {
        return positive;
    }

    public void setPositive(Date positive) {
        this.positive = positive;
    }

    @Basic
    @Column(name = "Sex", nullable = false)
    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "MaritalIndex", nullable = true)
    public Integer getMaritalIndex() {
        return maritalIndex;
    }

    public void setMaritalIndex(Integer maritalIndex) {
        this.maritalIndex = maritalIndex;
    }

    @Basic
    @Column(name = "Birth", nullable = true)
    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Basic
    @Column(name = "Tel", nullable = true, length = 13)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "Phone", nullable = true, length = 11)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "QQ", nullable = true, length = 15)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "WX", nullable = true, length = 15)
    public String getWx() {
        return wx;
    }

    public void setWx(String wx) {
        this.wx = wx;
    }

    @Basic
    @Column(name = "Email", nullable = true, length = 30)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "Postal", nullable = true, length = 6)
    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    @Basic
    @Column(name = "Addr", nullable = true, length = 30)
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
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

        cmsUserEntity that = (cmsUserEntity) o;

        if (zizoIndex != that.zizoIndex) return false;
        if (deptIndex != that.deptIndex) return false;
        if (workIndex != that.workIndex) return false;
        if (sex != that.sex) return false;
        if (state != that.state) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (pw != null ? !pw.equals(that.pw) : that.pw != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (induction != null ? !induction.equals(that.induction) : that.induction != null) return false;
        if (positive != null ? !positive.equals(that.positive) : that.positive != null) return false;
        if (maritalIndex != null ? !maritalIndex.equals(that.maritalIndex) : that.maritalIndex != null) return false;
        if (birth != null ? !birth.equals(that.birth) : that.birth != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (qq != null ? !qq.equals(that.qq) : that.qq != null) return false;
        if (wx != null ? !wx.equals(that.wx) : that.wx != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (postal != null ? !postal.equals(that.postal) : that.postal != null) return false;
        if (addr != null ? !addr.equals(that.addr) : that.addr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = zizoIndex;
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (pw != null ? pw.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + deptIndex;
        result = 31 * result + workIndex;
        result = 31 * result + (induction != null ? induction.hashCode() : 0);
        result = 31 * result + (positive != null ? positive.hashCode() : 0);
        result = 31 * result + (sex ? 1 : 0);
        result = 31 * result + (maritalIndex != null ? maritalIndex.hashCode() : 0);
        result = 31 * result + (birth != null ? birth.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (wx != null ? wx.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (postal != null ? postal.hashCode() : 0);
        result = 31 * result + (addr != null ? addr.hashCode() : 0);
        result = 31 * result + (state ? 1 : 0);
        return result;
    }
}
