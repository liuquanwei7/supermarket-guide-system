package com.lqw.supermarketGuideSystem.myMap.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/8
 * @TIME: 11:34
 */


@Entity
@Data
public class MyMap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int merchantId;
    private String merchantName;
    private String merchantPicture;
    private Double door;
    private Double gate;
    private Double x;
    private Double y;
    private Double w;
    private Double h;
    private String type;

}
