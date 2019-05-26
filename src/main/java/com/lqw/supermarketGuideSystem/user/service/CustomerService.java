package com.lqw.supermarketGuideSystem.user.service;

import com.lqw.supermarketGuideSystem.user.domain.Customer;
import com.lqw.supermarketGuideSystem.user.dto.LoginGetDTO;

import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/2/13
 * @TIME: 11:12
 */


public interface CustomerService {
    /**
     * 注册账号
     *
     * @param customer
     * @return true：注册成功  false：注册失败
     */
    Boolean signUpAccount(Customer customer);

    /**
     * 根据account判断该是否存在账号
     *
     * @param account
     * @return true：存在  false：不存在
     */
    Boolean checkAccountIsExist(String account);

    /**
     * 通过id查找顾客
     *
     * @param id
     * @return
     */
    List<Customer> findCustomerById(int id);

    Customer signInAccount(LoginGetDTO loginGetDTO);
}
