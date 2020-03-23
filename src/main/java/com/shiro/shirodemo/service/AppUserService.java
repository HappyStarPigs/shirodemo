package com.shiro.shirodemo.service;

import com.shiro.shirodemo.entity.AppUser;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jwy
 * @since 2020-03-23
 */
public interface AppUserService extends IService<AppUser> {

    public List<AppUser> findAppUserByPage(Integer page, Integer size,String findkey);

    public Integer gettotal();
}
