package com.lqw.supermarketGuideSystem.user.web;

import com.lqw.supermarketGuideSystem.common.dto.ResultDTO;
import com.lqw.supermarketGuideSystem.common.exception.ApiException;
import com.lqw.supermarketGuideSystem.user.domain.Customer;
import com.lqw.supermarketGuideSystem.user.service.impl.CustomerServiceImpl;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/2/13
 * @TIME: 10:13
 */

@RestController
@RequestMapping(value = "/api/customer")
public class CustomerController {
    @Autowired
    CustomerServiceImpl service;

    @ApiOperation(value = "新顾客注册", notes = "顾客信息")
    @RequestMapping(value = "",method = RequestMethod.POST)
    public ResultDTO postCustomer(@RequestBody @Valid @ApiParam(name = "customer", value = "顾客",required = true) Customer customer, BindingResult result) {
        if(result.hasErrors()){
            List<FieldError> fieldErrors = result.getFieldErrors();
            for(FieldError fieldError : fieldErrors){
                throw new ApiException(4100L,fieldError.getDefaultMessage());
            }
        }
        if(service.signUpAccount(customer)) {
            return ResultDTO.builder().statusCode(2000L).message("success").build();
        }else {
            return ResultDTO.builder().statusCode(4000L).message("false").build();
        }
    }
}
