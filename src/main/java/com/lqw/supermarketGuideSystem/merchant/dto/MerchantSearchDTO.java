package com.lqw.supermarketGuideSystem.merchant.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 12:35
 */


@Component
@Data
public class MerchantSearchDTO {
    private int id;
    private String name;
    private  String picture;
}
