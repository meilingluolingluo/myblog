package com.mll.weblog.web.model.vo.wiki;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:07
 * @description: 知识库列表
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindWikiListRspVO {
    private Long id;
    private String cover;
    private String title;
    private String summary;

    /**
     * 是否置顶
     */
    private Boolean isTop;

    /**
     * 第一篇文章 ID
     */
    private Long firstArticleId;
}
