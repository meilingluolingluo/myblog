package com.mll.weblog.web.controller;

import com.mll.weblog.common.aspect.ApiOperationLog;
import com.mll.weblog.web.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: TestController
 * @Author mll
 * @Package com.mll.weblog.web.controller
 * @Date 2024/10/4 19:43
 * @description: 测试user
 */
@RestController
@Slf4j
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public User test(@RequestBody User user) {
        // 返参
        return user;
    }

}