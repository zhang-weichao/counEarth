package com.countuniverse.countearth.model;

import java.util.Date;
/**
 * @author john
 * @version 1.0
 * className Star
 * Descripttion  all of the star (plant and star )
 * Date 2020/7/7 11:24
 */
public class Star {
    private String id;
    private String name;
    /**
     * int  0 〜 4 294 967 295   40 亿
     * bigint  0 〜 18 446 744 073 709 551 615    千京
     * 宇宙年龄大约138.2亿
     * 1、个、十、百、千 万、十万、百万、千万 亿、十亿、百亿、千亿 兆、十兆、百兆、千兆 
     *
     * 2、京、十京、百京、千京 垓、十垓、百垓、千垓 秭、十秭、百秭、千秭 穰、十穰、百穰、千穰 
     *
     * 3、沟、十沟、百沟、千沟 涧、十涧、百涧、千涧 正、十正、百正、千正 载、十载、百载、千载 
     *
     * 4、极、十极、百极、千极 恒河沙、十恒河沙、百恒河沙、千恒河沙 阿僧祗、十阿僧祗、百阿僧祗、千阿僧祗
     *
     * 5、那由他、十那由他、百那由他、千那由他 不可思议、十不可思议、百不可思议、千不可思议 无量、十无量、百无量、千无量 大数、十大数、百大数、千大数 
     *
     * 星球的统计单位 看来时不能和地球生命的采用一个度量的单位了   载
     */
    private Integer age;
    private String nickName;
    // 直径 米
    private Integer diameter;
    // 自转 second
    private Integer rotationPeriod;
    // 质量 kg
    private Integer mass;
    // 重力 ft/s*s
    private Integer gravity;
    // 体积 m*m*m
    private Integer volume;
    // 密度 cm*cm*cm/g
    private Integer density;
    // 公转的轨道
    private String orbitId;
    // 行星的范畴归类
    private String categoryId;
    // 行星的主星
    private String masterId;
    //行星的中心点在四维空间的位置
    private String locId;
    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    public Star() {
    }

    public Star(String id, String name, Integer age, String nickName, Integer diameter, Integer rotationPeriod, Integer mass, Integer gravity, Integer volume, Integer density, String orbitId, String categoryId, String masterId, String locId, Date createTime, String createBy, Date updateTime, String updateBy) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nickName = nickName;
        this.diameter = diameter;
        this.rotationPeriod = rotationPeriod;
        this.mass = mass;
        this.gravity = gravity;
        this.volume = volume;
        this.density = density;
        this.orbitId = orbitId;
        this.categoryId = categoryId;
        this.masterId = masterId;
        this.locId = locId;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public Integer getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(Integer rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public Integer getMass() {
        return mass;
    }

    public void setMass(Integer mass) {
        this.mass = mass;
    }

    public Integer getGravity() {
        return gravity;
    }

    public void setGravity(Integer gravity) {
        this.gravity = gravity;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getDensity() {
        return density;
    }

    public void setDensity(Integer density) {
        this.density = density;
    }

    public String getOrbitId() {
        return orbitId;
    }

    public void setOrbitId(String orbitId) {
        this.orbitId = orbitId == null ? null : orbitId.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId == null ? null : masterId.trim();
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
        return "Star{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                ", diameter=" + diameter +
                ", rotationPeriod=" + rotationPeriod +
                ", mass=" + mass +
                ", gravity=" + gravity +
                ", volume=" + volume +
                ", density=" + density +
                ", orbitId='" + orbitId + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", masterId='" + masterId + '\'' +
                ", locId='" + locId + '\'' +
                ", createTime=" + createTime +
                ", createBy='" + createBy + '\'' +
                ", updateTime=" + updateTime +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}