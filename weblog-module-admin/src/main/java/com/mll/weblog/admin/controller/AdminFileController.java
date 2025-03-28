package com.mll.weblog.admin.controller;

import com.mll.weblog.admin.service.AdminFileService;
import com.mll.weblog.common.aspect.ApiOperationLog;
import com.mll.weblog.common.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-09-15 14:01
 * @description: 文件模块
 **/
@RestController
@RequestMapping("/admin")
@Api(tags = "Admin 文件模块")
public class AdminFileController {

    @Autowired
    private AdminFileService fileService;

    @PostMapping("/file/upload")
    @ApiOperation(value = "文件上传")
    @ApiOperationLog(description = "文件上传")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public Response uploadFile(@RequestParam MultipartFile file) {
        return fileService.uploadFile(file);
    }

}
