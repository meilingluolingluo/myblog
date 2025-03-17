package com.mll.weblog.web.service;

import com.mll.weblog.common.utils.Response;
import com.mll.weblog.web.model.vo.article.FindArticleDetailReqVO;
import com.mll.weblog.web.model.vo.article.FindIndexArticlePageListReqVO;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:03
 * @description: 文章
 **/
public interface ArticleService {
    /**
     * 获取首页文章分页数据
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);

    /**
     * 获取文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);

}
