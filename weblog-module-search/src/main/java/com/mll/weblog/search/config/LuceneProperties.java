package com.mll.weblog.search.config;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-05-11 8:49
 * @description: lucene 配置
 **/
@ConfigurationProperties(prefix = "lucene")
@Component
@Data
public class LuceneProperties {
    private String indexDir;
}
