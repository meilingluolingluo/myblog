package com.mll.weblog.web.model.vo.tag;

import com.mll.weblog.common.model.BasePageQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:07
 * @description: 标签下文章列表
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindTagArticlePageListReqVO extends BasePageQuery {

    /**
     * 标签 ID
     */
    @NotNull(message = "标签 ID 不能为空")
    private Long id;

}
