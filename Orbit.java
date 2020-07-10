package com.countuniverse.countearth.bean;

/**
 * @className Orbit
 * Descripttion TODO
 * author john
 * Date 2020/7/9 11:43
 * version 0.0.1
 */
public class Orbit {

    // 轨道编号
    private String id;
    // 轨道名称
    private String name;
    // 轨道几何形状
    private String geometricShape;
    // 轨道昵称
    private String nickName;
    // 轨道 运行一圈 ：秒
    private Long orbitalPeriod;
    // 轨道直径 米
    private Long diameter;
    // 每一个 90的点 在四维空间的位置
    private Location a;
    private Location b;
    private Location c;
    private Location d;

}
