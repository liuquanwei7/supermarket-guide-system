package com.lqw.supermarketGuideSystem.myMap.repository;

import com.lqw.supermarketGuideSystem.myMap.domain.MyMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/8
 * @TIME: 11:35
 */


public interface MyMapRepository extends JpaRepository<MyMap,Integer> {

    /**
     * 查询所有地图信息
     * @return
     */

    List<MyMap> findAll();
}
