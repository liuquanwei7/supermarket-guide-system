package com.lqw.supermarketGuideSystem.user.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/2/13
 * @TIME: 14:20
 */

@Data
@Component
public class Customer {
    private int id;
    private String account;
    private String password;
    private String type;
    private String name;
    @Range(max = 120,min = 1,message = "年龄范围1~120")
    private Integer age;
    @Pattern(regexp = "/男|'女'/", message = "aa")
    private String gender;
    private Integer phone;
    @Email(message = "邮箱格式有误")
    private String email;
    private String picture;
}
