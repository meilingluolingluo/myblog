package com.mll.weblog.admin.model.vo.article;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.validation.constraints.NotNull;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-09-15 14:07
 * @description: 更新文章置顶状态
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "更新文章置顶状态 VO")
public class UpdateArticleIsTopReqVO {

    @NotNull(message = "文章 ID 不能为空")
    private Long id;

    @NotNull(message = "文章置顶状态不能为空")
    private Boolean isTop;
}
