package com.mll.weblog.admin.model.vo.comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-09-15 14:07
 * @description: 评论分页
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCommentPageListRspVO {

    private Long id;

    private String routerUrl;

    private String avatar;

    private String nickname;

    private String mail;

    private String website;

    private LocalDateTime createTime;

    private String content;

    private Integer status;

    private String reason;
}
