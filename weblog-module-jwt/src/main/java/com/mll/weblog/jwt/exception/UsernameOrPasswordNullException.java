package com.mll.weblog.jwt.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @Title: UsernameOrPasswordNullException
 * @Author mll
 * @Package com.mll.weblog.web.exception
 * @Date 2024/10/7 18:40
 * @description: 用户名校验
 */
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}
