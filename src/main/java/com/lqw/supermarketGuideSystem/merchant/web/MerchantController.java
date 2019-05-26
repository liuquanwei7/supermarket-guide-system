package com.lqw.supermarketGuideSystem.merchant.web;

import com.lqw.supermarketGuideSystem.common.dto.ResultDTO;
import com.lqw.supermarketGuideSystem.discount.domain.Discount;
import com.lqw.supermarketGuideSystem.discount.dto.DiscountSearchByTitleDTO;
import com.lqw.supermarketGuideSystem.discount.service.impl.DiscountServiceImpl;
import com.lqw.supermarketGuideSystem.merchant.domain.Merchant;
import com.lqw.supermarketGuideSystem.merchant.dto.MerchantSearchDTO;
import com.lqw.supermarketGuideSystem.merchant.service.impl.MerchantServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 12:11
 */


@RestController
@RequestMapping(value = "api/merchant/")
public class MerchantController {
    @Autowired
    MerchantServiceImpl service;

    @Autowired
    DiscountServiceImpl discountService;

    @ApiOperation(value = "获取商店信息")
    @RequestMapping(value = "/search/{name}",method = RequestMethod.GET)
    public ResultDTO getMerchant(@PathVariable("name") String name){
        List result = new ArrayList();
        List<MerchantSearchDTO> result0 = service.getMerchantSearch(name);
        List<DiscountSearchByTitleDTO> result1 = discountService.getDiscountSearch(name);
        if(result0!=null){
            result.addAll(result0);
        }
        if(result1!=null) {
            result.addAll(result1);
        }
        if(result.size()>0){
            return ResultDTO.builder().statusCode(2000L).message("success").data(result).build();
        }else {
            return ResultDTO.builder().statusCode(4000L).message("false").build();
        }
    }

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ResultDTO getMerchantById(@PathVariable("id") int id) {
        List result = new ArrayList();
        List<Merchant> result0 = service.getMerchant(id);
        List<Discount> result1 = discountService.getDiscountByMerchantId(id);
        if(result0!=null){
            result.addAll(result0);
        }
        if(result1!=null) {
            result.addAll(result1);
        }
        if(result.size()>0){
            return ResultDTO.builder().statusCode(2000L).message("success").data(result).build();
        }else {
            return ResultDTO.builder().statusCode(4000L).message("false").build();
        }
    }
}
