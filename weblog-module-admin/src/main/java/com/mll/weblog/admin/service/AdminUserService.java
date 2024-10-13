package com.mll.weblog.admin.service;

import com.mll.weblog.admin.model.vo.UpdateAdminUserPasswordReqVO;
import com.mll.weblog.common.utils.Response;

/**
 * @Title: AdminUserService
 * @Author mll
 * @Package com.mll.weblog.admin.service
 * @Date 2024/10/13 20:58
 * @description: 管理员服务类
 */
public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response<UpdateAdminUserPasswordReqVO> updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);
}

