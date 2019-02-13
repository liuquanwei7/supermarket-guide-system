package com.lqw.supermarketGuideSystem.user.service.impl;

import com.lqw.supermarketGuideSystem.common.exception.ApiUserSignUpException;
import com.lqw.supermarketGuideSystem.user.domain.Customer;
import com.lqw.supermarketGuideSystem.user.domain.User;
import com.lqw.supermarketGuideSystem.user.repository.UserRepository;
import com.lqw.supermarketGuideSystem.user.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/2/13
 * @TIME: 11:12
 */

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    UserRepository repository;

    @Override
    public Boolean signUpAccount(Customer customer) {
        if(checkAccountIsExist(customer.getAccount())) {
            return false;
        }else {
            User user = new User();
            BeanUtils.copyProperties(customer,user);
            repository.save(user);
            return true;
        }
    }

    @Override
    public Boolean checkAccountIsExist(String account) {
        if(repository.findByAccount(account).isPresent()){
            throw new ApiUserSignUpException("账号已存在");
        }else {
            return false;
        }
    }
}
