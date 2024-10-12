package com.mll.weblog.common.domain.dos;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

/**
 * @Title: UserRoleDO
 * @Author  mll
 * @Package com.mll.weblog.common.domain.dos
 * @Date  2024/10/12 10:34
 * @description: 用户角色类
*/
@Data
@Builder
@TableName("t_user_role")
public class UserRoleDO {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String username;
    private String role;
    private Date createTime;
}
