package com.yzj.api.oerder.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yzj.api.oerder.feign.MemberApiFeign;
import com.yzj.base.RetJson;
import com.yzj.entity.UserEntity;
import com.yzj.service.IOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api("订单服务")
@RestController
public class OrderController implements IOrderService {

    /**
     * 订单服务调用会员服务
     */
    @Resource
    private MemberApiFeign memberApiFeign;

    @ApiOperation("获取用户信息")
    @ApiImplicitParam(name = "name",value ="用户姓名",required = true,dataType = "String")
    @GetMapping("/oderToMember")
    public UserEntity oderToMember(String name) {
        // TODO Auto-generated method stub
        UserEntity str = memberApiFeign.getMember(name);
        return str;
    }

    @RequestMapping("/oderTogetUserInfo")
    public RetJson oderTogetUserInfo() {
        // TODO Auto-generated method stub
        RetJson str = memberApiFeign.getUserInfo();
        return str;
    }

    /**
     * 第一种注解方式
     * @return
     */
    @HystrixCommand(fallbackMethod = "fallbackMethod")
    @RequestMapping("/oderTogetUserInfoHystrix")
    public RetJson oderTogetUserInfoHystrix() {
        // TODO Auto-generated method stub
        RetJson str = memberApiFeign.getUserInfo();
        return str;
    }
    /**
     * 服务降级方法
     * @return
     */
    public RetJson fallbackMethod() {
        // TODO Auto-generated method stub
        return new RetJson(1, "系统繁忙，请稍后再试", null);
    }

    /**
     * 第二种类方式
     * @return
     */
    @RequestMapping("/oderTogetUserInfoHystrixfallbackclass")
    public RetJson fallbackclass() {
        // TODO Auto-generated method stub
        RetJson str = memberApiFeign.getUserInfo();
        return str;
    }
}
