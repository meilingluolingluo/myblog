package com.mll.weblog.common.enums;

import com.mll.weblog.common.exception.BaseExceptionInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Title: ResponseCodeEnum
 * @Author mll
 * @Package com.mll.weblog.common.enums
 * @Date 2024/10/5 11:38
 * @description: 响应异常代码
 */
@Getter
@AllArgsConstructor
public enum ResponseCodeEnum implements BaseExceptionInterface {

    // ----------- 通用异常状态码 -----------
    SYSTEM_ERROR("10000", "出错啦，后台小哥正在努力修复中..."),

    // ----------- 业务异常状态码 -----------
    PRODUCT_NOT_FOUND("20000", "该产品不存在（测试使用）"),

    PARAM_NOT_VALID("10001", "参数错误"),
    ;

    // 异常码
    private final String errorCode;
    // 错误信息
    private final String errorMessage;

}