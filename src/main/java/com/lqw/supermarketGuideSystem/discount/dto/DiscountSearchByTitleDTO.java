package com.lqw.supermarketGuideSystem.discount.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 14:41
 */


@Component
@Data
public class DiscountSearchByTitleDTO {
    private int id;
    private String title;
    private String merchandisePicture;
    private int merchantId;
}
