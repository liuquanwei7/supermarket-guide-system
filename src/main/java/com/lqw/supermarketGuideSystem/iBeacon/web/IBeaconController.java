package com.lqw.supermarketGuideSystem.iBeacon.web;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lqw.supermarketGuideSystem.common.dto.ResultDTO;
import com.lqw.supermarketGuideSystem.iBeacon.domain.Ibeacon;
import com.lqw.supermarketGuideSystem.iBeacon.service.impl.IBeaconServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/9
 * @TIME: 9:36
 */


@RestController
@RequestMapping(value = "/api/ibeacon")
public class IBeaconController {
    @Autowired
    IBeaconServiceImpl service;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public ResultDTO getIBeacon(@RequestBody String minors) {
        List<Integer> list = JSONArray.parseArray(minors,Integer.class);
        List<Ibeacon> result = service.getIBeacon(list);
        if(result.size()>0){
            return ResultDTO.builder().statusCode(2000L).message("success").data(result).build();
        }else {
            return ResultDTO.builder().statusCode(4000L).message("false").build();
        }
    }
}
