package com.lqw.supermarketGuideSystem.iBeacon.repository;

import com.lqw.supermarketGuideSystem.iBeacon.domain.Ibeacon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/9
 * @TIME: 9:39
 */


public interface IBeaconRepository extends JpaRepository<Ibeacon,Integer> {
    /**
     * 通过minor查找iBeacon信息
     *
     * @param minor
     * @return
     */
    List<Ibeacon> findByMinor(@Param("minor") int minor);
}
