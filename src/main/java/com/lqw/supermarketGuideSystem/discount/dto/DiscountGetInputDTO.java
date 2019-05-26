package com.lqw.supermarketGuideSystem.discount.dto;

import com.lqw.supermarketGuideSystem.iBeacon.domain.Ibeacon;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/26
 * @TIME: 10:29
 */


@Component
@Data
public class DiscountGetInputDTO {
    int page;
    String iBeacons;
}
