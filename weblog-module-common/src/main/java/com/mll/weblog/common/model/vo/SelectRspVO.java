package com.mll.weblog.common.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024/9/20 16:02
 * 
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SelectRspVO {
    /**
     * Select 下拉列表的展示文字
     */
    private String label;

    /**
     * Select 下拉列表的 value 值，如 ID 等
     */
    private Object value;
}
