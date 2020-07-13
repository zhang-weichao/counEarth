package com.countuniverse.countearth.controller;

import com.countuniverse.countearth.service.StarService;
import com.countuniverse.countearth.vo.StarVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


/**
 * @className SolrSysController
 * Descripttion Solar System
 * author john
 * Date 2020/7/10 10:59
 * version 0.0.1
 */
@Controller
public class SolarSysController {

    @Autowired
    private StarService starService;


    @RequestMapping("/solarStart")
    @ResponseBody
    public String solarStart() {
        Map map = new HashMap<String ,Object>();
        StarVO vo = starService.oneWithSate(map);
        return vo.toString();
    }
}
