package com.lqw.supermarketGuideSystem.myMap.web;

import com.lqw.supermarketGuideSystem.common.dto.ResultDTO;
import com.lqw.supermarketGuideSystem.myMap.domain.MyMap;
import com.lqw.supermarketGuideSystem.myMap.service.impl.MyMapServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/8
 * @TIME: 11:37
 */


@RestController
@RequestMapping(value = "api/map")
public class MyMapController {
    @Autowired
    MyMapServiceImpl service;

    @ApiOperation(value = "获取地图信息",notes = "地图信息")
    @RequestMapping(value = "",method = RequestMethod.GET)
    public ResultDTO getMap() {
        List<MyMap>  result = service.getMap();
        if(result.size()>0){
            return ResultDTO.builder().statusCode(2000L).message("success").data(result).build();
        }else {
            return ResultDTO.builder().statusCode(4000L).message("false").build();
        }
    }
}
