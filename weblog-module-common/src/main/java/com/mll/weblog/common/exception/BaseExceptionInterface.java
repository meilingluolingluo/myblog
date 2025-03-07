package com.mll.weblog.common.exception;

/**
 * @Title: BaseExceptionTnterface
 * @Author mll
 * @Package com.mll.weblog.common.exception
 * @Date 2024/10/5 11:36
 * @description: 通用异常接口
 */
public interface BaseExceptionInterface {
    String getErrorCode();

    String getErrorMessage();
}
