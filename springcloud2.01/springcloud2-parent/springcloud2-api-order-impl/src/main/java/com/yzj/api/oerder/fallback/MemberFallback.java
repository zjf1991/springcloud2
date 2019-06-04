package com.yzj.api.oerder.fallback;


import com.yzj.api.oerder.feign.MemberApiFeign;
import com.yzj.base.RetJson;
import com.yzj.entity.UserEntity;
import org.springframework.stereotype.Component;

/**
 * 服务降级类实现feign接口,将服务降级类注入spring
 */
@Component
public class MemberFallback implements MemberApiFeign {

    @Override
    public UserEntity getMember(String name) {
        return null;
    }

    @Override
    public RetJson getUserInfo() {
        return new RetJson(1, "系统繁忙，请稍后再试，服务降级类", null);
    }
}
