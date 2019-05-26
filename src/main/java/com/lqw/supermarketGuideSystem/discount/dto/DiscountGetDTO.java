package com.lqw.supermarketGuideSystem.discount.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/7
 * @TIME: 21:09
 */


@Data
@Component
public class DiscountGetDTO {
    private int id;
    private int merchantId;
    private String merchantName;
    private String merchandiseName;
    private String merchandisePicture;
    private int commentStar;
    private String title;
    private int discount;
    private float oldPrice;
}
