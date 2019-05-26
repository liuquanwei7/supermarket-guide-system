package com.lqw.supermarketGuideSystem.discount.repository;

import com.lqw.supermarketGuideSystem.discount.domain.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/7
 * @TIME: 17:14
 */


public interface DiscountRepository extends JpaRepository<Discount, Integer> {

    /**
     * 查找折扣信息并且分页查询
     *
     * @param offset 从第几页开始查
     * @param size   大小
     * @return 折扣信息  此实体可能为缺省值
     */
    @Query(value = "select * from discount where end_time > sysdate() order by merchant_id not in (:iBeacon1,:iBeacon2,:iBeacon3),id DESC limit :offset,:size", nativeQuery = true)
    List<Discount> findAll(@Param("iBeacon1") int iBeacon1, @Param("iBeacon2") int iBeacon2, @Param("iBeacon3") int iBeacon3, @Param("offset") int offset, @Param("size") int size);

    /**
     * 通过title模糊查询折扣信息
     *
     * @param title
     * @return 折扣信息
     */
    List<Discount> findByTitleLike(@Param("title") String title);

    /**
     * 通过MerchantId获取
     *
     * @param id
     * @return
     */
    List<Discount> findByMerchantId(@Param("id") int id);
}
