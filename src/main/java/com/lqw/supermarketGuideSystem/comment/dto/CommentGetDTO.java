package com.lqw.supermarketGuideSystem.comment.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 23:14
 */


@Component
@Data
public class CommentGetDTO {
    private Integer star;
    private String content;
    private Timestamp commentTime;
    private String name;
    private String picture;
}
