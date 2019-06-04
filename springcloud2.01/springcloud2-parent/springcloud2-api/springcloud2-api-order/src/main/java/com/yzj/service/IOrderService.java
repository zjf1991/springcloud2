package com.yzj.service;

import org.springframework.web.bind.annotation.RequestMapping;

import com.yzj.base.RetJson;

/**
 * 订单服务接口
 *
 * @author Administrator
 */
public interface IOrderService {


    @RequestMapping("/oderToMember")
    public <UserEntity> UserEntity oderToMember(String name);

    @RequestMapping("/oderTogetUserInfoHystrix")
    public RetJson oderTogetUserInfo();
}
