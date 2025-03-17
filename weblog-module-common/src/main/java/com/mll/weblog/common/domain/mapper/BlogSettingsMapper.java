package com.mll.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mll.weblog.common.domain.dos.BlogSettingsDO;
import com.mll.weblog.common.domain.dos.UserDO;

import java.time.LocalDateTime;

/**
 * @author: mll
 * @url: www.mll.com
 * @date: 2024-08-22 17:06
 * @description: TODO
 **/
public interface BlogSettingsMapper extends BaseMapper<BlogSettingsDO> {
}
