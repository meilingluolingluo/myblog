package com.mll.weblog.web.model.vo.wiki;

import com.mll.weblog.web.model.vo.article.FindPreNextArticleRspVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:07
 * @description: 知识库文章上下页
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindWikiArticlePreNextRspVO {
    /**
     * 上一篇文章
     */
    private FindPreNextArticleRspVO preArticle;
    /**
     * 下一篇文章
     */
    private FindPreNextArticleRspVO nextArticle;

}
