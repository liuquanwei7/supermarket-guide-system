package com.lqw.supermarketGuideSystem.merchant.service;

import com.lqw.supermarketGuideSystem.merchant.domain.Merchant;
import com.lqw.supermarketGuideSystem.merchant.dto.MerchantSearchDTO;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 12:12
 */


    public interface MerchantService {
    /**
     * 通过name模糊查询商店和优惠信息
     *
     * @param name
     * @return 商店信息
     */
    List<MerchantSearchDTO> getMerchantSearch(String name);

    /**
     * 通过id获取商店信息
     *
     * @param id
     * @return 商店信息
     */
    List<Merchant> getMerchant(int id);
}
