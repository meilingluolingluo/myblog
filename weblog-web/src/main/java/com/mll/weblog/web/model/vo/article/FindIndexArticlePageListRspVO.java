package com.mll.weblog.web.model.vo.article;

import com.mll.weblog.web.model.vo.category.FindCategoryListRspVO;
import com.mll.weblog.web.model.vo.tag.FindTagListRspVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:07
 * @description: 首页-文章分页
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindIndexArticlePageListRspVO {
    private Long id;
    private String cover;
    private String title;
    private LocalDate createDate;
    private String summary;
    /**
     * 文章分类
     */
    private FindCategoryListRspVO category;

    /**
     * 文章标签
     */
    private List<FindTagListRspVO> tags;

    /**
     * 是否置顶
     */
    private Boolean isTop;
}
