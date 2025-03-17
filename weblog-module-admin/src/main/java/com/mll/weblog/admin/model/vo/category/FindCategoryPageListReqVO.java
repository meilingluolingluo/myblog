package com.mll.weblog.admin.model.vo.category;

import com.mll.weblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-09-15 14:07
 * @description: 分类分页
 **/
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
