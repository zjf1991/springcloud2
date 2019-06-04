package com.yzj.api.member.controller;

import com.yzj.base.RetJson;
import com.yzj.entity.UserEntity;
import com.yzj.service.IMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@Api("会员服务")
@RestController
public class MemberController implements IMemberService {

    @ApiOperation("获取用户信息")
    @ApiImplicitParam(name = "name",value ="用户姓名",required = true,dataType = "String")
    @RequestMapping("/getMember")
    public UserEntity getMember(@RequestParam("name") String name) {
        // TODO Auto-generated method stub
        UserEntity user = new UserEntity();
        user.setName(name);
        user.setAge(23);
        return user;
    }

    @RequestMapping("/getUserInfo")
    public RetJson getUserInfo() {
        try {
            Thread.sleep(1500);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return new RetJson(1, "调用会员服务成功............", null);
    }


}
