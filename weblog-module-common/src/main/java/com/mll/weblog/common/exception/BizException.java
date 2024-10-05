package com.mll.weblog.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @Title: BizException
 * @Author mll
 * @Package com.mll.weblog.common.exception
 * @Date 2024/10/5 15:13
 * @description: 业务异常
 */
@Getter
@Setter
public class BizException extends RuntimeException {
    // 异常码
    private String errorCode;
    // 错误信息
    private String errorMessage;

    public BizException(BaseExceptionInterface baseExceptionInterface) {
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }
}