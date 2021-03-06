package com.lqw.supermarketGuideSystem.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/2/13
 * @TIME: 15:10
 */

@Getter
@Setter
public class ApiException extends RuntimeException {
    protected Long errorCode;
    protected Object data;

    public ApiException(Long errorCode, String message, Object data, Throwable e) {
        super(message, e);
        this.errorCode = errorCode;
        this.data = data;
    }

    public ApiException(Long errorCode, String message, Object data) {
        this(errorCode, message, data, null);
    }

    public ApiException(Long errorCode, String message) {
        this(errorCode, message, null, null);
    }

    public ApiException(String message, Throwable e) {
        this(null, message, null, e);
    }

    public ApiException() {

    }

    public ApiException(Throwable e) {
        super(e);
    }


}
