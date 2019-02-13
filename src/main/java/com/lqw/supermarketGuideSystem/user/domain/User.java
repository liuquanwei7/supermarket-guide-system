package com.lqw.supermarketGuideSystem.user.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;


/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/2/13
 * @TIME: 14:10
 */


@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String account;
    private String password;
    private String type;
    private String name;
    private Integer age;
    private String gender;
    private Integer phone;
    private String email;
    private Timestamp signUpDate;
}
