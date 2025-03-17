package com.mll.weblog.admin.service;

import com.mll.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.mll.weblog.admin.model.vo.user.UpdateAdminUserPasswordReqVO;
import com.mll.weblog.common.utils.Response;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-09-15 14:03
 * 
 **/
public interface AdminBlogSettingsService {
    /**
     * 更新博客设置信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);

    /**
     * 获取博客设置详情
     * @return
     */
    Response findDetail();
}
