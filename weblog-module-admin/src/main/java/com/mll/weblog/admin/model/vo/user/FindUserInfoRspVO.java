package com.mll.weblog.admin.model.vo.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Title: FindUserInfoRspVO
 * @Author mll
 * @Package com.mll.weblog.admin.model.vo
 * @Date 2024/10/13 22:08
 * @description: 查询用户信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindUserInfoRspVO {
    /**
     * 用户名
     */
    private String username;

}
