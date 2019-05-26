package com.lqw.supermarketGuideSystem.iBeacon.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/9
 * @TIME: 9:32
 */


@Entity
@Data
public class Ibeacon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String uuid;
    private String major;
    private int minor;
    private Double x;
    private Double y;

}
