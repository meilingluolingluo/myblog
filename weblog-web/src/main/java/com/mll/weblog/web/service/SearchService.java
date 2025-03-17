package com.mll.weblog.web.service;

import com.mll.weblog.common.utils.Response;
import com.mll.weblog.web.model.vo.search.SearchArticlePageListReqVO;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:03
 * @description:
 **/
public interface SearchService {

    /**
     * 关键词分页搜索
     * @param searchArticlePageListReqVO
     * @return
     */
    Response searchArticlePageList(SearchArticlePageListReqVO searchArticlePageListReqVO);
}
