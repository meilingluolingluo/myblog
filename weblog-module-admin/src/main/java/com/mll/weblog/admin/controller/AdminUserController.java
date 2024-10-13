package com.mll.weblog.admin.controller;

import com.mll.weblog.admin.model.vo.FindUserInfoRspVO;
import com.mll.weblog.admin.model.vo.UpdateAdminUserPasswordReqVO;
import com.mll.weblog.admin.service.AdminUserService;
import com.mll.weblog.common.aspect.ApiOperationLog;
import com.mll.weblog.common.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: AdminUserController
 * @Author mll
 * @Package com.mll.weblog.admin.controller
 * @Date 2024/10/13 21:01
 * @description: 用户控制类
 */
@RestController
@RequestMapping("/admin")
@Api(tags = "Admin 用户模块")
public class AdminUserController {

    @Autowired
    private AdminUserService userService;

    @PostMapping("/password/update")
    @ApiOperation(value = "修改用户密码")
    @ApiOperationLog(description = "修改用户密码")
    public Response<UpdateAdminUserPasswordReqVO> updatePassword(@RequestBody @Validated UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO) {
        return userService.updatePassword(updateAdminUserPasswordReqVO);
    }
    @PostMapping("/user/info")
    @ApiOperation(value = "获取用户信息")
    @ApiOperationLog(description = "获取用户信息")
    public Response<FindUserInfoRspVO> findUserInfo() {
        return userService.findUserInfo();
    }

}
