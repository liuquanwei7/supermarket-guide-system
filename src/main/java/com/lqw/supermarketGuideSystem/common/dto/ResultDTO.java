package com.lqw.supermarketGuideSystem.common.dto;

import lombok.*;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/2/13
 * @TIME: 15:23
 */

@Setter
@Getter
@Builder
public class ResultDTO {
    private Long statusCode;
    private String message;
    private Object data;
}
