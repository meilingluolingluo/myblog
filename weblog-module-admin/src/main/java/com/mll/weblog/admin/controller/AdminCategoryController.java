package com.mll.weblog.admin.controller;

import com.mll.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.mll.weblog.admin.model.vo.category.DeleteCategoryReqVO;
import com.mll.weblog.admin.model.vo.category.FindCategoryPageListReqVO;
import com.mll.weblog.admin.model.vo.category.FindCategoryPageListRspVO;
import com.mll.weblog.admin.service.AdminCategoryService;
import com.mll.weblog.common.aspect.ApiOperationLog;
import com.mll.weblog.common.utils.PageResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mll.weblog.common.utils.Response;
/**
 * @Title: AdminCategoryController
 * @Author mll
 * @Package com.mll.weblog.admin.controller
 * @Date 2024/10/14 16:39
 * @description: 分类控制类
 */
@RestController
@RequestMapping("/admin")
@Api(tags = "Admin 分类模块")
public class AdminCategoryController {

    @Autowired
    private AdminCategoryService categoryService;

    @PostMapping("/category/add")
    @ApiOperation(value = "添加分类")
    @ApiOperationLog(description = "添加分类")
    public Response<AddCategoryReqVO> addCategory(@RequestBody @Validated AddCategoryReqVO addCategoryReqVO) {
        return categoryService.addCategory(addCategoryReqVO);
    }
    @PostMapping("/category/list")
    @ApiOperation(value = "分类分页数据获取")
    @ApiOperationLog(description = "分类分页数据获取")
    public PageResponse<FindCategoryPageListReqVO> findCategoryList(@RequestBody @Validated FindCategoryPageListReqVO findCategoryPageListReqVO) {
        return categoryService.findCategoryList(findCategoryPageListReqVO);
    }

    @PostMapping("/category/delete")
    @ApiOperation(value = "删除分类")
    @ApiOperationLog(description = "删除分类")
    public Response<DeleteCategoryReqVO> deleteCategory(@RequestBody @Validated DeleteCategoryReqVO deleteCategoryReqVO) {
        return categoryService.deleteCategory(deleteCategoryReqVO);
    }

    @PostMapping("/category/select/list")
    @ApiOperation(value = "分类 Select 下拉列表数据获取")
    @ApiOperationLog(description = "分类 Select 下拉列表数据获取")
    public Response<FindCategoryPageListRspVO> findCategorySelectList() {
        return categoryService.findCategorySelectList();
    }


}
