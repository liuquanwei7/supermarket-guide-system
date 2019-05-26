package com.lqw.supermarketGuideSystem.merchant.service.impl;

import com.lqw.supermarketGuideSystem.common.exception.merchant.ApiMerchantGetNullException;
import com.lqw.supermarketGuideSystem.discount.domain.Discount;
import com.lqw.supermarketGuideSystem.discount.dto.DiscountSearchByTitleDTO;
import com.lqw.supermarketGuideSystem.discount.repository.DiscountRepository;
import com.lqw.supermarketGuideSystem.merchant.domain.Merchant;
import com.lqw.supermarketGuideSystem.merchant.dto.MerchantSearchDTO;
import com.lqw.supermarketGuideSystem.merchant.repository.MerchantRepository;
import com.lqw.supermarketGuideSystem.merchant.service.MerchantService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 12:12
 */


@Service
public class MerchantServiceImpl implements MerchantService {
    @Autowired
    MerchantRepository merchantRepository;
    @Autowired
    DiscountRepository discountRepository;

    @Override
    public List<MerchantSearchDTO> getMerchantSearch(String name) {
        List<Merchant> result0 = merchantRepository.findByNameLike("%"+name+"%");
        if(!result0.isEmpty()){
            Iterator it = result0.iterator();
            List<MerchantSearchDTO> result = new ArrayList<>();
            while (it.hasNext()){
                MerchantSearchDTO merchantSearchDTO = new MerchantSearchDTO();
                BeanUtils.copyProperties(it.next(),merchantSearchDTO);
                result.add(merchantSearchDTO);
            }
            if(result.size()>0){
                return result;
            }else {
                return null;
            }
        }else {
            return null;
        }
    }

    @Override
    public List<Merchant> getMerchant(int id) {
        List<Merchant> result = merchantRepository.findById(id);
        if(result.size()>0){
            return result;
        }else {
            return null;
        }
    }
}
