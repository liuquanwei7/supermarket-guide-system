package com.lqw.supermarketGuideSystem.myMap.service;

import com.lqw.supermarketGuideSystem.myMap.domain.MyMap;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/8
 * @TIME: 11:36
 */


public interface MyMapService {
    /**
     * 获取地图信息
     *
     * @return 地图信息
     */
    List<MyMap> getMap();
}
