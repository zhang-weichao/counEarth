package com.countuniverse.countearth.service;

import com.countuniverse.countearth.vo.StarVO;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @className StarService
 * Descripttion TODO
 * author john
 * Date 2020/7/10 17:26
 * version 0.0.1
 */
@Service
public interface StarService {

    /**
     * @author john
     * description  完整的一个星系谱
     * Date:  2020/7/10 17:31
     * @param  map map
     */
    StarVO oneWithSate(Map<String ,Object> map);
}
