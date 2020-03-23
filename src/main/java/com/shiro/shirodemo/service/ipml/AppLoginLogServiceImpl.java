package com.shiro.shirodemo.service.ipml;

import com.shiro.shirodemo.entity.AppLoginLog;
import com.shiro.shirodemo.mapper.AppLoginLogMapper;
import com.shiro.shirodemo.service.AppLoginLogService;
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
public class AppLoginLogServiceImpl extends ServiceImpl<AppLoginLogMapper, AppLoginLog> implements AppLoginLogService {
	
}
