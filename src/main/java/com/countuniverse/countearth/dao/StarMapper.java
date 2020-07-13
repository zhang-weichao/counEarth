package com.countuniverse.countearth.dao;

import com.countuniverse.countearth.model.Star;
import com.countuniverse.countearth.vo.StarVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface StarMapper {
    int deleteByPrimaryKey(String id);

    int insert(Star record);

    int insertSelective(Star record);

    Star selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Star record);

    int updateByPrimaryKey(Star record);
    /**
     * @author john
     * description  完整的一个下级星系谱 oneWithSate  without master
     * Date:  2020/7/10 17:31
     * @param  map map
     */
    StarVO oneWithSate(Map<String ,Object> map);

    /**
     * @author john
     * description  get all satelite
     * Date:  2020/7/13 14:11
     */
    List<StarVO> findSate(String id);

}