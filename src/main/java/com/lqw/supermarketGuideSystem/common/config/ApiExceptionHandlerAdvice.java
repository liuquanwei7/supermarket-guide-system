package com.lqw.supermarketGuideSystem.common.config;

import com.lqw.supermarketGuideSystem.common.dto.ResultDTO;
import com.lqw.supermarketGuideSystem.common.exception.ApiException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @AUTHOR: liuquanwei
 * @DATE: 2019/2/13
 * @TIME: 15:32
 */

@Slf4j
@ControllerAdvice
public class ApiExceptionHandlerAdvice {
    /**
     * Handle exceptions thrown by handlers.
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity<ResultDTO> exception(Exception exception, HttpServletResponse response) {
        ResultDTO resultDTO = ResultDTO.builder().build();
        log.info("======有异常=====");
        if (exception instanceof ApiException) { //api异常
            ApiException apiException = (ApiException) exception;
            resultDTO.setStatusCode(apiException.getErrorCode());
        } else {  //未知异常
            resultDTO.setStatusCode(4000L);
        }
        resultDTO.setMessage(exception.getMessage());
        ResponseEntity<ResultDTO> responseEntity = new ResponseEntity<>(resultDTO, HttpStatus.valueOf(response.getStatus()));
        return responseEntity;
    }
}
