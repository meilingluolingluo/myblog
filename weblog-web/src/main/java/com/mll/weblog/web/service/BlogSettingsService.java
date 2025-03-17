package com.mll.weblog.web.service;

import com.mll.weblog.common.utils.Response;

/**
 * @author: 
 * @url: www.mll.com
 * @date: 2024-09-15 14:03
 * @description: 博客设置
 **/
public interface BlogSettingsService {
    /**
     * 获取博客设置信息
     * @return
     */
    Response findDetail();
}
