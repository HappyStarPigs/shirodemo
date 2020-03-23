package com.shiro.shirodemo.service.ipml;

import com.shiro.shirodemo.entity.AppAccount;
import com.shiro.shirodemo.mapper.AppAccountMapper;
import com.shiro.shirodemo.service.AppAccountService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jwy
 * @since 2020-03-23
 */
@Service
public class AppAccountServiceImpl extends ServiceImpl<AppAccountMapper, AppAccount> implements AppAccountService {
	
}
