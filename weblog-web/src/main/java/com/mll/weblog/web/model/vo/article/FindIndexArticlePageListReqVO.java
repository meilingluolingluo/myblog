package com.mll.weblog.web.model.vo.article;

import com.mll.weblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:07
 * @description: 首页-文章分页
 **/
@Data
@Builder
@ApiModel(value = "首页查询文章分页 VO")
public class FindIndexArticlePageListReqVO extends BasePageQuery {
}
