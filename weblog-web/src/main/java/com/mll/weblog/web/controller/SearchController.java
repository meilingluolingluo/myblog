package com.mll.weblog.web.controller;

import com.mll.weblog.common.aspect.ApiOperationLog;
import com.mll.weblog.common.utils.Response;
import com.mll.weblog.web.model.vo.search.SearchArticlePageListReqVO;
import com.mll.weblog.web.service.SearchService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:01
 * @description: 搜索
 **/
@RestController
@Api(tags = "搜索")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping("/article/search")
    @ApiOperation(value = "文章搜索")
    @ApiOperationLog(description = "文章搜索")
    public Response searchArticlePageList(@RequestBody @Validated SearchArticlePageListReqVO searchArticlePageListReqVO) {
        return searchService.searchArticlePageList(searchArticlePageListReqVO);
    }

}
