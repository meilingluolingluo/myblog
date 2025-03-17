package com.mll.weblog.admin.service;

import com.mll.weblog.common.utils.Response;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-09-15 14:03
 * @description: 仪表盘
 **/
public interface AdminDashboardService {

    /**
     * 获取仪表盘基础统计信息
     * @return
     */
    Response findDashboardStatistics();

    /**
     * 获取文章发布热点统计信息
     * @return
     */
    Response findDashboardPublishArticleStatistics();

    /**
     * 获取文章最近一周 PV 访问量统计信息
     * @return
     */
    Response findDashboardPVStatistics();
}
