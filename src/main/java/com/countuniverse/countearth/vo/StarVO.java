package com.countuniverse.countearth.vo;

import com.countuniverse.countearth.model.Category;
import com.countuniverse.countearth.model.Location;
import com.countuniverse.countearth.model.Orbit;
import com.countuniverse.countearth.model.Star;

import java.util.List;

/**
 * @className StarVO
 * Descripttion TODO
 * author john
 * Date 2020/7/10 17:22
 * version 0.0.1
 */
public class StarVO extends Star {
    //卫星列表
    private List<StarVO> satellite;
    //private StarVO master;
    private Category category;
    private Orbit orbit;
    private Location location;
}
