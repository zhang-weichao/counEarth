package com.countuniverse.countearth.bean;

import java.util.List;

/**
 * @author john
 * @version 1.0
 * className Star
 * Descripttion  all of the star (plant and star )
 * Date 2020/7/7 11:24
 */
public class Star {

    // 年龄
    private Long age;
    // 名字
    private String name;
    // 昵称
    private String nickname;
    // 编号
    private String id;
    // 直径 米
    private Long diameter;
    // 自转 second
    private Long rotationPeriod;
    // 质量 kg
    private Long mass;
    // 重力 ft/s*s
    private Long gravity;
    // 体积 m*m*m
    private Long volume;
    // 密度 cm*cm*cm/g
    private Long density;
    // 公转的轨道
    private Orbit orbit;
    // 行星的范畴归类
    private Category category;
    // 行星的主星
    private Star master;
    //行星的中心点在四维空间的位置
    private Location sloc;
    // 卫星列表
    private List<Star> satellite;
}
