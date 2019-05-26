package com.lqw.supermarketGuideSystem.discount.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/7
 * @TIME: 17:11
 */


@Entity
@Data
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int merchantId;
    private String merchantName;
    private String merchandiseName;
    private String merchandisePicture;
    private int commentStar;
    private String title;
    private int discount;
    private Timestamp beginTime;
    private Timestamp endTime;
    private Timestamp releaseDate;
    private float oldPrice;
    private int star;
}
