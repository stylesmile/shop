package com.console.service;

import com.console.mapper.SysUserMapper;
import com.shop.service.MyBaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Stylesmile
 * @description SysUser
 * @date 2019/01/06
 */
@Service
public class SysUserService extends MyBaseService<SysUserMapper> {

    @Resource
    private SysUserMapper sysUserMapper;


}
