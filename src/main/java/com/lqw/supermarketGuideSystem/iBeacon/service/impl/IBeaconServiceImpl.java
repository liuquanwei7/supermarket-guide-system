package com.lqw.supermarketGuideSystem.iBeacon.service.impl;

import com.lqw.supermarketGuideSystem.iBeacon.domain.Ibeacon;
import com.lqw.supermarketGuideSystem.iBeacon.repository.IBeaconRepository;
import com.lqw.supermarketGuideSystem.iBeacon.service.IBeaconService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/9
 * @TIME: 9:38
 */


@Service
public class IBeaconServiceImpl implements IBeaconService {
    @Autowired
    IBeaconRepository repository;

    @Override
    public List<Ibeacon> getIBeacon(List<Integer> list) {
        List<Ibeacon> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list1.add(repository.findByMinor(list.get(i)).get(0));
        }
        return list1;
    }
}
