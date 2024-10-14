package com.mll.weblog.admin.service;

import com.mll.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.mll.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.mll.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.mll.weblog.common.utils.PageResponse;
import com.mll.weblog.common.utils.Response;

/**
 * @Title: AdminCategoryService
 * @Author mll
 * @Package com.mll.weblog.admin.service
 * @Date 2024/10/14 16:36
 * @description: 添加分类业务类
 */
public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response<AddCategoryReqVO> addCategory(AddCategoryReqVO addCategoryReqVO);
    /**
     * 分类分页数据查询
     * @param findCategoryPageListReqVO
     * @return
     */
    PageResponse findCategoryList(FindCategoryPageListReqVO findCategoryPageListReqVO);

    /**
     * 删除分类
     * @param deleteCategoryReqVO
     * @return
     */
    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);

    /**
     * 获取文章分类的 Select 列表数据
     * @return
     */
    Response findCategorySelectList();
}
