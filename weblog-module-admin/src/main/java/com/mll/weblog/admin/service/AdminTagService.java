package com.mll.weblog.admin.service;

import com.mll.weblog.admin.model.vo.tag.AddTagReqVO;
import com.mll.weblog.admin.model.vo.tag.DeleteTagReqVO;
import com.mll.weblog.admin.model.vo.tag.FindTagPageListReqVO;
import com.mll.weblog.admin.model.vo.tag.SearchTagsReqVO;
import com.mll.weblog.common.utils.PageResponse;
import com.mll.weblog.common.utils.Response;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-09-15 14:03
 * 
 **/
public interface AdminTagService {

    /**
     * 添加标签集合
     * @param addTagReqVO
     * @return
     */
    Response addTags(AddTagReqVO addTagReqVO);

    /**
     * 查询标签分页
     * @param findTagPageListReqVO
     * @return
     */
    PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO);

    /**
     * 删除标签
     * @param deleteTagReqVO
     * @return
     */
    Response deleteTag(DeleteTagReqVO deleteTagReqVO);

    /**
     * 根据标签关键词模糊查询
     * @param searchTagsReqVO
     * @return
     */
    Response searchTags(SearchTagsReqVO searchTagsReqVO);

    /**
     * 查询标签 Select 列表数据
     * @return
     */
    Response findTagSelectList();
}
