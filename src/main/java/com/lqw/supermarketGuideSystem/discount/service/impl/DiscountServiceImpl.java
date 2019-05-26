package com.lqw.supermarketGuideSystem.discount.service.impl;

import com.lqw.supermarketGuideSystem.common.exception.discount.ApiDiscountGetNullException;
import com.lqw.supermarketGuideSystem.common.exception.merchant.ApiMerchantGetNullException;
import com.lqw.supermarketGuideSystem.discount.domain.Discount;
import com.lqw.supermarketGuideSystem.discount.dto.DiscountGetDTO;
import com.lqw.supermarketGuideSystem.discount.dto.DiscountSearchByTitleDTO;
import com.lqw.supermarketGuideSystem.discount.repository.DiscountRepository;
import com.lqw.supermarketGuideSystem.discount.service.DiscountService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/7
 * @TIME: 17:17
 */


@Service
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    DiscountRepository repository;

    @Override
    public List<DiscountGetDTO> getDiscount(int page) {
        List<Discount> result0;
        ArrayList<Integer> iBeacons = new ArrayList<>();
        iBeacons.add(5);
        iBeacons.add(6);
        iBeacons.add(8);
        if(page==1){
            result0 = repository.findAll(iBeacons.get(0),iBeacons.get(1),iBeacons.get(2),0,5);
        }else {
            result0 = repository.findAll(iBeacons.get(0),iBeacons.get(1),iBeacons.get(2),0,5*page);
        }

        Iterator it = result0.iterator();
        List<DiscountGetDTO> result = new ArrayList<>();
        while (it.hasNext()){
            DiscountGetDTO discountGetDTO = new DiscountGetDTO();
            BeanUtils.copyProperties(it.next(),discountGetDTO);
            result.add(discountGetDTO);
        }
        if(result.size()>0){
            return result;
        }else {
            throw new ApiDiscountGetNullException("获取折扣信息失败！");
        }
    }

    @Override
    public List<DiscountSearchByTitleDTO> getDiscountSearch(String title) {
        List<Discount> result0 = repository.findByTitleLike("%"+title+"%");
        if(!result0.isEmpty()){
            Iterator it1 = result0.iterator();
            List<DiscountSearchByTitleDTO> result = new ArrayList<>();
            while (it1.hasNext()) {
                DiscountSearchByTitleDTO discountSearchByTitleDTO = new DiscountSearchByTitleDTO();
                BeanUtils.copyProperties(it1.next(),discountSearchByTitleDTO);
                result.add(discountSearchByTitleDTO);
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
    public List<Discount> getDiscountByMerchantId(int id) {
        List<Discount> result = repository.findByMerchantId(id);
        if(result.size()>0){
            return result;
        }else {
            return null;
        }
    }
}

