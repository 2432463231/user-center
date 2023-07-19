package com.example.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author user_center
 * @since 2023-07-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="User对象", description="用户")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户昵称")
    private String username;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "账号")
    @TableField("userAccount")
    private String useraccount;

    @ApiModelProperty(value = "用户头像")
    @TableField("avatarUrl")
    private String avatarurl;

    @ApiModelProperty(value = "性别")
    private Integer gender;

    @ApiModelProperty(value = "密码")
    @TableField("userPassword")
    private String userpassword;

    @ApiModelProperty(value = "电话")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "状态 0 - 正常")
    @TableField("userStatus")
    private Integer userstatus;

    @ApiModelProperty(value = "创建时间")
    @TableField("createTime")
    private LocalDateTime createtime;

    @TableField("updateTime")
    private LocalDateTime updatetime;

    @ApiModelProperty(value = "是否删除")
    @TableField("isDelete")
    private Integer isdelete;

    @ApiModelProperty(value = "用户角色 0 - 普通用户 1 - 管理员")
    @TableField("userRole")
    private Integer userrole;

    @ApiModelProperty(value = "星球编号")
    @TableField("planetCode")
    private String planetcode;


}
