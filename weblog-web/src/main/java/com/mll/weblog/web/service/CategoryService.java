package com.mll.weblog.web.service;

import com.mll.weblog.common.utils.Response;
import com.mll.weblog.web.model.vo.category.FindCategoryArticlePageListReqVO;
import com.mll.weblog.web.model.vo.category.FindCategoryListReqVO;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:03
 * @description: 分类
 **/
public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList(FindCategoryListReqVO findCategoryListReqVO);

    /**
     * 获取分类下文章分页数据
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}
