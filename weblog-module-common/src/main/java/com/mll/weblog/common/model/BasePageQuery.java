package com.mll.weblog.common.model;

import lombok.Data;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-09-19 8:54
 * 
 **/
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
