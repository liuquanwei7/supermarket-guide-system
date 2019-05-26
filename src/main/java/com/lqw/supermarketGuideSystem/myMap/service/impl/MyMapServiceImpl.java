package com.lqw.supermarketGuideSystem.myMap.service.impl;

import com.lqw.supermarketGuideSystem.myMap.domain.MyMap;
import com.lqw.supermarketGuideSystem.myMap.repository.MyMapRepository;
import com.lqw.supermarketGuideSystem.myMap.service.MyMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/8
 * @TIME: 11:36
 */


@Service
public class MyMapServiceImpl implements MyMapService {
    @Autowired
    MyMapRepository repository;

    @Override
    public List<MyMap> getMap() {
        return repository.findAll();
    }
}
