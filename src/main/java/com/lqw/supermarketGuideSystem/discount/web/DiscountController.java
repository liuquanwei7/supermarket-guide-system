package com.lqw.supermarketGuideSystem.discount.web;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lqw.supermarketGuideSystem.common.dto.ResultDTO;
import com.lqw.supermarketGuideSystem.discount.domain.Discount;
import com.lqw.supermarketGuideSystem.discount.dto.DiscountGetDTO;
import com.lqw.supermarketGuideSystem.discount.dto.DiscountGetInputDTO;
import com.lqw.supermarketGuideSystem.discount.dto.DiscountPostDTO;
import com.lqw.supermarketGuideSystem.discount.service.impl.DiscountServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/7
 * @TIME: 17:16
 */


@RestController
@RequestMapping(value = "api/discount")
public class DiscountController {

    @Autowired
    DiscountServiceImpl service;


    @ApiOperation(value = "获取折扣信息", notes = "折扣")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResultDTO getDiscount(@RequestBody DiscountGetInputDTO discountGetInputDTO) {
        List<DiscountGetDTO> result = service.getDiscount(discountGetInputDTO.getPage());
        if (result.size() > 0) {
            return ResultDTO.builder().statusCode(2000L).message("success").data(result).build();
        } else {
            return ResultDTO.builder().statusCode(4000L).message("false").build();
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/merchant", method = RequestMethod.POST)
    public ResultDTO postDiscount(@RequestBody DiscountPostDTO discountPostDTO) {
        System.out.println(discountPostDTO);
        List<DiscountGetDTO> result = service.getDiscount(1);
        if (result.size() > 0) {
            return ResultDTO.builder().statusCode(2000L).message("success").data(result).build();
        } else {
            return ResultDTO.builder().statusCode(4000L).message("false").build();
        }
    }
}
