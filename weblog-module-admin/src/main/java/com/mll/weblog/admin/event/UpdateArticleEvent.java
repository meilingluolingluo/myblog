package com.mll.weblog.admin.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2023/11/9 10:05
 * @description: 文章更新事件
 **/

@Getter
public class UpdateArticleEvent extends ApplicationEvent {

    /**
     * 文章 ID
     */
    private Long articleId;

    public UpdateArticleEvent(Object source, Long articleId) {
        super(source);
        this.articleId = articleId;
    }
}
