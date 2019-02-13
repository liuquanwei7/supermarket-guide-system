package com.lqw.supermarketGuideSystem.user.service;

import com.lqw.supermarketGuideSystem.user.domain.Customer;

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
}
