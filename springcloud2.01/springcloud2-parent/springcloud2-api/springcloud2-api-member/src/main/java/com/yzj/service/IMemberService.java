package com.yzj.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yzj.base.RetJson;
import com.yzj.entity.UserEntity;

/**
 * 会员服务接口
 *
 * @author Administrator
 */
public interface IMemberService {


    @RequestMapping("/getMember")
    public UserEntity getMember(@RequestParam("name") String name);


    @RequestMapping("/getUserInfo")
    public RetJson getUserInfo();
}
