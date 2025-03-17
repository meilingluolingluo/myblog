package com.mll.weblog.admin.service;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-09-15 14:03
 * @description:
 **/
public interface AdminStatisticsService {

    /**
     * 统计各分类下文章总数
     */
    void statisticsCategoryArticleTotal();

    /**
     * 统计各标签下文章总数
     */
    void statisticsTagArticleTotal();
}
