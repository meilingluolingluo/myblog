package com.mll.weblog.web.controller;

import com.mll.weblog.common.aspect.ApiOperationLog;
import com.mll.weblog.common.domain.mapper.UserMapper;
import com.mll.weblog.common.enums.ResponseCodeEnum;
import com.mll.weblog.common.exception.BizException;
import com.mll.weblog.common.utils.JsonUtil;
import com.mll.weblog.common.utils.Response;
import com.mll.weblog.web.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.FieldError;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.stream.Collectors;

/**
 * @Title: TestController
 * @Author mll
 * @Package com.mll.weblog.web.controller
 * @Date 2024/10/4 19:43
 * @description: 测试user
 */
@RestController
@Slf4j
@Api(tags = "首页模块")
public class TestController {

    @PostMapping("/admin/test")
    @ApiOperationLog(description = "测试接口")
    @ApiOperation(value = "测试接口")
    public Response<User> test(@RequestBody @Validated User user) {
        // 打印入参
        log.info(JsonUtil.toJsonString(user));

        // 设置三种日期字段值
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateDate(LocalDate.now());
        user.setTime(LocalTime.now());

        return Response.success(user);
    }
    @PostMapping("/admin/update")
    @ApiOperationLog(description = "测试更新接口")
    @ApiOperation(value = "测试更新接口")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response<User> testUpdate() {
        log.info("更新成功...");
        return Response.success();
    }


}