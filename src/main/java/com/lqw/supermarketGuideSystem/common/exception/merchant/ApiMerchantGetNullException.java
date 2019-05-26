package com.lqw.supermarketGuideSystem.common.exception.merchant;

import com.lqw.supermarketGuideSystem.common.exception.ApiException;
import com.lqw.supermarketGuideSystem.common.exception.UserErrorCode;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/4/11
 * @TIME: 13:28
 */


public class ApiMerchantGetNullException extends ApiException {
    public ApiMerchantGetNullException(String message){super(UserErrorCode.SIGNUPERROR, message, null);}

}
