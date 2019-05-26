package com.lqw.supermarketGuideSystem.discount.service;

import com.lqw.supermarketGuideSystem.discount.domain.Discount;
import com.lqw.supermarketGuideSystem.discount.dto.DiscountGetDTO;
import com.lqw.supermarketGuideSystem.discount.dto.DiscountSearchByTitleDTO;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/7
 * @TIME: 17:16
 */


public interface DiscountService {
    /**
     * 根据页数获取优惠信息
     *
     * @param page 页数
     * @return 优惠信息
     */
    List<DiscountGetDTO> getDiscount(int page);

    /**
     * 根据title来获取折扣信息
     *
     * @param title 题目
     * @return 折扣信息
     */
    List<DiscountSearchByTitleDTO> getDiscountSearch(String title);

    List<Discount> getDiscountByMerchantId(int id);
}
