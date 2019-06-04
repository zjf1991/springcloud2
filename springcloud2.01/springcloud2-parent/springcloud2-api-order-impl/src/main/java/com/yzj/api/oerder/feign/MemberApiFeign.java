package com.yzj.api.oerder.feign;

import com.yzj.api.oerder.fallback.MemberFallback;
import com.yzj.service.IMemberService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 1.订单服务feign接口继承会员服务接口
 *
 *2.
 *
 * @author Administrator
 */
@FeignClient(value = "member",fallback = MemberFallback.class)
public interface MemberApiFeign extends IMemberService {

}
