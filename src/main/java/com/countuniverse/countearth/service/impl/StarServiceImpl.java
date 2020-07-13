package com.countuniverse.countearth.service.impl;

import com.countuniverse.countearth.dao.StarMapper;
import com.countuniverse.countearth.service.StarService;
import com.countuniverse.countearth.vo.StarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @className StarServiceImpl
 * Descripttion TODO
 * author john
 * Date 2020/7/10 17:27
 * version 0.0.1
 */
@Service
public class StarServiceImpl implements StarService {

    @Autowired
    private StarMapper starMapper;

    /**
     * @param map map
     * @author john
     * description  完整的一个星系谱
     * Date:  2020/7/10 17:31
     */
    @Override
    public StarVO oneWithSate(Map<String, Object> map) {
        StarVO vo = starMapper.oneWithSate(map);
        return vo;
    }
}
