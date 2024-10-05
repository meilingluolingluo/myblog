package com.mll.weblog.web.controller;

import com.mll.weblog.common.aspect.ApiOperationLog;
import com.mll.weblog.common.enums.ResponseCodeEnum;
import com.mll.weblog.common.exception.BizException;
import com.mll.weblog.common.utils.Response;
import com.mll.weblog.web.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.FieldError;
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
public class TestController {

    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public Response test(@RequestBody @Validated User user) {
        return Response.success();
    }


}