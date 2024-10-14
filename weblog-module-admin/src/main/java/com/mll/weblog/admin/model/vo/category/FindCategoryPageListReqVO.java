package com.mll.weblog.admin.model.vo.category;

import com.mll.weblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.*;

import java.time.LocalDate;

/**
 * @Title: FindCategoryPageListReqVO
 * @Author mll
 * @Package com.mll.weblog.admin.model.vo.category
 * @Date 2024/10/14 17:10
 * @description: 分类分页
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "查询分类分页数据入参 VO")
public class FindCategoryPageListReqVO extends BasePageQuery {

    /**
     * 分类名称
     */
    private String name;

    /**
     * 创建的起始日期
     */
    private LocalDate startDate;

    /**
     * 创建的结束日期
     */
    private LocalDate endDate;

}

