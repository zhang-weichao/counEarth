package com.countuniverse.countearth.model;

import java.util.Date;
/**
 * @className Category
 * Descripttion  动植物 分类 域、界、门、纲、目、科、属、种等八个主要等级。其中种是分类所用的基要单位
 *  Domain, Kingdom, Phylum, Class, Order, Family, Genus, Species
 *  天体的系统分类应该是7 层级即可 暂时分为 四层级：统-系-属-支
 *  国，部，司，处，科（共五级）
 * author john
 * 省 市 县 镇 村
 * Date 2020/7/9 14:16
 * version 0.0.1
 */
public class Category {
    private String id;

    private String name;

    private String nickName;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    public Category() {
    }

    public Category(String id, String name, String nickName, Date createTime, String createBy, Date updateTime, String updateBy) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
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
}