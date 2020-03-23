package com.shiro.shirodemo.mapper;

import com.shiro.shirodemo.entity.AppUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author jwy
 * @since 2020-03-23
 */
public interface AppUserMapper extends BaseMapper<AppUser> {
    public List<AppUser> findAppUserByPage();
}