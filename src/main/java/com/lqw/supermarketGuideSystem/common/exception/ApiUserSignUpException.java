package com.lqw.supermarketGuideSystem.common.exception;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/2/13
 * @TIME: 15:39
 */


public class ApiUserSignUpException extends ApiException{
    public ApiUserSignUpException(String message) {
        super(UserErrorCode.SIGNUPERROR, message, null);
    }
}
