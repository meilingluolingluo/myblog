package com.mll.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mll.weblog.common.domain.dos.UserRoleDO;

import java.util.List;

/**
 * @Title: UserRoleMapper
 * @Author  mll
 * @Package com.mll.weblog.common.domain.mapper
 * @Date  2024/10/12 10:35
 * @description: 用户角色接口
*/
public interface UserRoleMapper extends BaseMapper<UserRoleDO> {
    /**
     * 根据用户名查询
     * @param username
     * @return
     */
    default List<UserRoleDO> selectByUsername(String username) {
        LambdaQueryWrapper<UserRoleDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserRoleDO::getUsername, username);

        return selectList(wrapper);
    }
}
