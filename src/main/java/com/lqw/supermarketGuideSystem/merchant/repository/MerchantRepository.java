package com.lqw.supermarketGuideSystem.merchant.repository;

import com.lqw.supermarketGuideSystem.merchant.domain.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 12:13
 */


public interface MerchantRepository extends JpaRepository<Merchant,Integer> {
    /**
     * 通过name模糊查询商店
     *
     * @param name
     * @return 商店信息
     */
    List<Merchant> findByNameLike(@Param("name") String name);

    /**
     * 通过id查找店铺信息
     *
     * @param id
     * @return 店铺信息
     */
    List<Merchant> findById(@Param("id") int id);
}
