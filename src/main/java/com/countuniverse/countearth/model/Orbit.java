package com.countuniverse.countearth.model;

import java.util.Date;
/**
 * @className Orbit
 * Descripttion 轨道
 * author john
 * Date 2020/7/9 11:43
 * version 0.0.1
 */
public class Orbit {
    private String id;

    private String name;

    private String nickName;
    // 轨道几何形状
    private String geometricShapeId;

    // 轨道直径 米
    private Integer diameter;
    // 每一个 90的点 在四维空间的位置  ,轨道默认为水平的，所以是轨道的中心点所在的位置；
    private String locId;
    // 轨道 运行一圈 ：秒
    private Integer period;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    public Orbit() {
    }

    public Orbit(String id, String name, String nickName, String geometricShapeId, Integer diameter, String locId, Integer period, Date createTime, String createBy, Date updateTime, String updateBy) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.geometricShapeId = geometricShapeId;
        this.diameter = diameter;
        this.locId = locId;
        this.period = period;
        this.createTime = createTime;
        this.createBy = createBy;
        this.updateTime = updateTime;
        this.updateBy = updateBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getGeometricShapeId() {
        return geometricShapeId;
    }

    public void setGeometricShapeId(String geometricShapeId) {
        this.geometricShapeId = geometricShapeId == null ? null : geometricShapeId.trim();
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId == null ? null : locId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    @Override
    public String toString() {
        return "Orbit{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", geometricShapeId='" + geometricShapeId + '\'' +
                ", diameter=" + diameter +
                ", locId='" + locId + '\'' +
                ", period=" + period +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                ", updateTime=" + updateTime +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}