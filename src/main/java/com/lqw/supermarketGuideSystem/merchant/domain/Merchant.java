package com.lqw.supermarketGuideSystem.merchant.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 12:13
 */


@Entity
@Data
public class Merchant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Timestamp registerTime;
    private String description;
    private String picture;
    private String type;
}
