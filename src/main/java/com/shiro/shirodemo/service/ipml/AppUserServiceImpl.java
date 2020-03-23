package com.shiro.shirodemo.service.ipml;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.shiro.shirodemo.entity.AppUser;
import com.shiro.shirodemo.mapper.AppUserMapper;
import com.shiro.shirodemo.pojo.dto.ParamsDto;
import com.shiro.shirodemo.service.AppUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jwy
 * @since 2020-03-23
 */
@Service
public class AppUserServiceImpl extends ServiceImpl<AppUserMapper, AppUser> implements AppUserService {
    @Autowired
    AppUserMapper appUserMapper;

    //
    public List<AppUser> findAppUserByPage(Integer page, Integer size,String findkey){
        EntityWrapper<AppUser> wrapper = new EntityWrapper();
        wrapper.like("username",findkey).or().like("phonenumber",findkey).or().like("email",findkey)
                .or().like("nickname",findkey);
        Page<AppUser> p = new Page<>(page,size);
        List<AppUser> list =appUserMapper.selectPage(p,wrapper);
        return list;
    }

    public Integer gettotal(){
        EntityWrapper<AppUser> wrapper = new EntityWrapper();
        return appUserMapper.selectCount(wrapper);
    }
}
