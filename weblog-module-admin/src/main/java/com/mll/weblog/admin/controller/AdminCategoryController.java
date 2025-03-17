package com.mll.weblog.admin.controller;

import com.mll.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.mll.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.mll.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.mll.weblog.admin.model.vo.user.UpdateAdminUserPasswordReqVO;
import com.mll.weblog.admin.service.AdminCategoryService;
import com.mll.weblog.admin.service.AdminUserService;
import com.mll.weblog.common.aspect.ApiOperationLog;
import com.mll.weblog.common.utils.PageResponse;
import com.mll.weblog.common.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-09-15 14:01
 * @description: 分类
 **/
@RestController
@RequestMapping("/admin/category")
@Api(tags = "Admin 分类模块")
public class AdminCategoryController {

    @Autowired
    private AdminCategoryService categoryService;

    @PostMapping("/add")
    @ApiOperation(value = "添加分类")
    @ApiOperationLog(description = "添加分类")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response addCategory(@RequestBody @Validated AddCategoryReqVO addCategoryReqVO) {
        return categoryService.addCategory(addCategoryReqVO);
    }

    @PostMapping("/list")
    @ApiOperation(value = "分类分页数据获取")
    @ApiOperationLog(description = "分类分页数据获取")
    public PageResponse findCategoryPageList(@RequestBody @Validated FindCategoryPageListReqVO findCategoryPageListReqVO) {
        return categoryService.findCategoryPageList(findCategoryPageListReqVO);
    }

    @PostMapping("/delete")
    @ApiOperation(value = "删除分类")
    @ApiOperationLog(description = "删除分类")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response deleteCategory(@RequestBody @Validated DeleteCategoryReqVO deleteCategoryReqVO) {
        return categoryService.deleteCategory(deleteCategoryReqVO);
    }

    @PostMapping("/select/list")
    @ApiOperation(value = "分类 Select 下拉列表数据获取")
    @ApiOperationLog(description = "分类 Select 下拉列表数据获取")
    public Response findCategorySelectList() {
        return categoryService.findCategorySelectList();
    }


}
