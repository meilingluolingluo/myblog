package com.mll.weblog.web.model.vo.archive;

import com.mll.weblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:07
 * @description: 文章归档
 **/
@Data
@Builder
@ApiModel(value = "文章归档分页 VO")
public class FindArchiveArticlePageListReqVO extends BasePageQuery {
}
