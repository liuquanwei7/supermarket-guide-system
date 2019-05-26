package com.lqw.supermarketGuideSystem.iBeacon.service;


import com.lqw.supermarketGuideSystem.iBeacon.domain.Ibeacon;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/9
 * @TIME: 9:38
 */


public interface IBeaconService {
    /**
     * 通过minor获取iBeacon信息
     *
     * @param list minor信息
     * @return iBeacon信息
     */
    List<Ibeacon> getIBeacon(List<Integer> list);
}
