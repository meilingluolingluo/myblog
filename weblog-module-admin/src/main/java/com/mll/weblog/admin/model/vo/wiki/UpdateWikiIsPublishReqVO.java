package com.mll.weblog.admin.model.vo.wiki;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-09-15 14:07
 * @description: 更新知识库发布状态
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "更新知识库发布状态 VO")
public class UpdateWikiIsPublishReqVO {

    @NotNull(message = "知识库 ID 不能为空")
    private Long id;

    @NotNull(message = "知识库发布状态不能为空")
    private Boolean isPublish;
}
