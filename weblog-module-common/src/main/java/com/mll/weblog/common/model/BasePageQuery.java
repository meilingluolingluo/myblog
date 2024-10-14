package com.mll.weblog.common.model;

import lombok.Data;

/**
 * @Title: BasePageQuery
 * @Author mll
 * @Package com.mll.weblog.common
 * @Date 2024/10/14 16:42
 * @description: 分页请求基础类
 */
@Data
public class BasePageQuery {
    /**
     * 当前页码, 默认第一页
     */
    private Long current = 1L;
    /**
     * 每页展示的数据数量，默认每页展示 10 条数据
     */
    private Long size = 10L;
}

