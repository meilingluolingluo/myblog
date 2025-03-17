package com.mll.weblog.web.service;

import com.mll.weblog.common.utils.Response;
import com.mll.weblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:03
 * @description: 归档文章
 **/
public interface ArchiveService {
    /**
     * 获取文章归档分页数据
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}
