package com.mll.weblog.admin.model.vo.wiki;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-09-15 14:07
 * @description: 知识库目录
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UpdateWikiCatalogItemReqVO {

    /**
     * 目录 ID
     */
    @NotNull(message = "目录 ID 不能为空")
    private Long id;

    private Long articleId;

    @NotBlank(message = "目录标题不能为空")
    private String title;

    private Integer sort;

    private Integer level;

    /**
     * 子目录
     */
    @Valid
    private List<UpdateWikiCatalogItemReqVO> children;

}
