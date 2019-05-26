package com.lqw.supermarketGuideSystem.user.service.impl;

import com.lqw.supermarketGuideSystem.common.exception.ApiUserSignUpException;
import com.lqw.supermarketGuideSystem.discount.dto.DiscountGetDTO;
import com.lqw.supermarketGuideSystem.user.domain.Customer;
import com.lqw.supermarketGuideSystem.user.domain.User;
import com.lqw.supermarketGuideSystem.user.dto.LoginGetDTO;
import com.lqw.supermarketGuideSystem.user.repository.UserRepository;
import com.lqw.supermarketGuideSystem.user.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        if(repository.findByAccount(account)!=null){
            throw new ApiUserSignUpException("账号已存在");
        }else {
            return false;
        }
    }

    @Override
    public List<Customer> findCustomerById(int id) {
        List<User> result1 = repository.findById(id);
        Iterator it = result1.iterator();
        List<Customer> result = new ArrayList<>();
        while (it.hasNext()){
            Customer customer = new Customer();
            BeanUtils.copyProperties(it.next(),customer);
            result.add(customer);
        }
        if(result.size()>0){
            return result;
        }else {
            return null;
        }
    }

    @Override
    public Customer signInAccount(LoginGetDTO loginGetDTO) {
        User user = repository.findByAccount(loginGetDTO.getAccount()).get(0);
        if(user!=null){
            if(loginGetDTO.getPassword()==user.getPassword()||loginGetDTO.getPassword().equals(user.getPassword())){
                Customer customer = new Customer();
                BeanUtils.copyProperties(user,customer);
                return customer;
            }else {
                return null;
            }
        }else {
            return null;
        }

    }
}
