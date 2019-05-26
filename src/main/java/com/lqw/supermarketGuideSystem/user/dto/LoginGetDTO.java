package com.lqw.supermarketGuideSystem.user.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/26
 * @TIME: 15:15
 */


@Component
@Data
public class LoginGetDTO {
    private String account;
    private String password;
}
