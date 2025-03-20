package com.mll.weblog.admin.config;

import io.minio.MinioClient;
import okhttp3.OkHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-05-11 8:49
 * 
 **/
@Configuration
public class MinioConfig {
    @Autowired
    private MinioProperties minioProperties;

    @Bean
    public MinioClient minioClient() {
        // 构建 Minio 客户端
        return MinioClient.builder()
                .endpoint(minioProperties.getEndpoint())
                .credentials(minioProperties.getAccessKey(), minioProperties.getSecretKey())
                .httpClient(
                        new
                                OkHttpClient.Builder()
                                .connectTimeout(30, TimeUnit.SECONDS)  // 连接超时
                                .readTimeout(60, TimeUnit.SECONDS)     // 读取超时
                                .writeTimeout(60, TimeUnit.SECONDS)    // 写入超时
                                .build()
                )
                .build();
    }
}
