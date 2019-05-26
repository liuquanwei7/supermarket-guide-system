package com.lqw.supermarketGuideSystem.common.exception.discount;

import com.lqw.supermarketGuideSystem.common.exception.ApiException;
import com.lqw.supermarketGuideSystem.common.exception.UserErrorCode;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/7
 * @TIME: 18:21
 */


public class ApiDiscountGetNullException extends ApiException {
    public ApiDiscountGetNullException(String message){super(UserErrorCode.SIGNUPERROR, message, null);}
}
