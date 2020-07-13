package com.countuniverse.countearth.dao;

import com.countuniverse.countearth.model.Orbit;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface OrbitMapper {
    int deleteByPrimaryKey(String id);

    int insert(Orbit record);

    int insertSelective(Orbit record);

    Orbit selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Orbit record);

    int updateByPrimaryKey(Orbit record);
}