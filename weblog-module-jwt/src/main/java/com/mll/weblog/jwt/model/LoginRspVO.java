package com.mll.weblog.jwt.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title: LoginRspVO
 * @Author mll
 * @Package com.mll.model
 * @Date 2024/10/9 22:31
 * @description: 登录响应参数类VO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginRspVO {

    /**
     * Token 值
     */
    private String token;

}
