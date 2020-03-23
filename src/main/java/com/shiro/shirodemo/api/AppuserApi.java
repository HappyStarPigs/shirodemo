package com.shiro.shirodemo.api;

import com.shiro.shirodemo.Enum.EnumCode;
import com.shiro.shirodemo.service.AppUserService;
import com.shiro.shirodemo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lijincan
 * @date: 2020年03月23日 9:42
 * @Description: TODO
 */
@RestController
@RequestMapping(value = "AppuserApi/v1")
public class AppuserApi {

    @Autowired
    AppUserService appUserService;

    @GetMapping("/findAppuserByPage")
    public Object findAppuserByPage(@RequestParam("page") Integer page, @RequestParam("size") Integer size, @RequestParam("keyword") String findkey){
        return  ResultUtil.result(EnumCode.OK.getValue(), "请求成功",
                appUserService.findAppUserByPage(page,size,findkey),appUserService.gettotal());
    }
}
