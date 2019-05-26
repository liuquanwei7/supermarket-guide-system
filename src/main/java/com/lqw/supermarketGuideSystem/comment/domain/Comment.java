package com.lqw.supermarketGuideSystem.comment.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 21:29
 */


@Entity
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int merchantId;
    private int userId;
    private Timestamp commentTime;
    private Integer star;
    private String content;

}
