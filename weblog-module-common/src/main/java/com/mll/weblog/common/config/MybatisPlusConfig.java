package com.mll.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Title: MybatisPlusConfig
 * @Author  mll
 * @Package com.mll.weblog.common.config
 * @Date  2024/10/10 19:42
 * @description: Mybatis Plus配置文件
*/
@Configuration
@MapperScan("com.mll.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}
