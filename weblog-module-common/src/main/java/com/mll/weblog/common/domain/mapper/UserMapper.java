package com.mll.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mll.weblog.common.domain.dos.UserDO;

/**
 * @Title: UserMapper
 * @Author  mll
 * @Package com.mll.weblog.common.domain.mapper
 * @Date  2024/10/10 19:51
 * @description: UserMapper
*/
public interface UserMapper extends BaseMapper<UserDO> {
    default UserDO findByUsername(String username) {
        LambdaQueryWrapper<UserDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserDO::getUsername, username);
        return selectOne(wrapper);
    }
}
