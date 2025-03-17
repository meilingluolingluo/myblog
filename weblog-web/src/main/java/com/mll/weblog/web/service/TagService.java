package com.mll.weblog.web.service;

import com.mll.weblog.common.utils.Response;
import com.mll.weblog.web.model.vo.tag.FindTagArticlePageListReqVO;
import com.mll.weblog.web.model.vo.tag.FindTagListReqVO;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:03
 * @description: 分类
 **/
public interface TagService {
    /**
     * 获取标签列表
     * @return
     */
    Response findTagList(FindTagListReqVO findTagListReqVO);

    /**
     * 获取标签下文章分页列表
     * @param findTagArticlePageListReqVO
     * @return
     */
    Response findTagPageList(FindTagArticlePageListReqVO findTagArticlePageListReqVO);
}
