package com.lqw.supermarketGuideSystem.discount.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/5/1
 * @TIME: 22:18
 */


@Component
@Data
public class DiscountPostDTO {
    private String title;
    private String merchandiseName;
    private float oldPrice;
    private int discount;
}
