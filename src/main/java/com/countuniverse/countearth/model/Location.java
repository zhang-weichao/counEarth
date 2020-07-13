package com.countuniverse.countearth.model;

import java.math.BigDecimal;
/**
 * @className Location
 * Descripttion 定位一个点
 * author john
 * Date 2020/7/9 11:59
 * version 0.0.1
 */
public class Location {
    private String id;

    private String name;

    private BigDecimal w; // time

    private BigDecimal x;

    private BigDecimal y;

    private BigDecimal z;

    public Location() {
    }

    public Location(String id, String name, BigDecimal w, BigDecimal x, BigDecimal y, BigDecimal z) {
        this.id = id;
        this.name = name;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
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

    public BigDecimal getW() {
        return w;
    }

    public void setW(BigDecimal w) {
        this.w = w;
    }

    public BigDecimal getX() {
        return x;
    }

    public void setX(BigDecimal x) {
        this.x = x;
    }

    public BigDecimal getY() {
        return y;
    }

    public void setY(BigDecimal y) {
        this.y = y;
    }

    public BigDecimal getZ() {
        return z;
    }

    public void setZ(BigDecimal z) {
        this.z = z;
    }
}