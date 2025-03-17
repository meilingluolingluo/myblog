package com.mll.weblog.web.service;

import com.mll.weblog.common.utils.Response;
import com.mll.weblog.web.model.vo.wiki.FindWikiArticlePreNextReqVO;
import com.mll.weblog.web.model.vo.wiki.FindWikiCatalogListReqVO;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:03
 * @description: 知识库
 **/
public interface WikiService {

    /**
     * 获取知识库
     * @return
     */
    Response findWikiList();

    /**
     * 获取知识库目录
     * @param findWikiCatalogListReqVO
     * @return
     */
    Response findWikiCatalogList(FindWikiCatalogListReqVO findWikiCatalogListReqVO);

    /**
     * 获取上下页
     * @param findWikiArticlePreNextReqVO
     * @return
     */
    Response findArticlePreNext(FindWikiArticlePreNextReqVO findWikiArticlePreNextReqVO);

}
