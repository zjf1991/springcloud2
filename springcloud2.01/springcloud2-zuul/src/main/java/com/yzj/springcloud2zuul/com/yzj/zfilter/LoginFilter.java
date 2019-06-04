package com.yzj.springcloud2zuul.com.yzj.zfilter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

//@Component
public class LoginFilter extends ZuulFilter {

    /**
     * 过滤类型 pre 表示在请求前执行
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行顺序  当一个请求同一阶段有多个过滤器的时候,多个过滤器的执行顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /***
     * 判断过滤器是否生效 true生效  false不生效
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 业务拦截
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        //获取请求上下文
      RequestContext requestContext= RequestContext.getCurrentContext();
       HttpServletRequest request=requestContext.getRequest();
       String userToken=request.getParameter("userToken");
       if(StringUtils.isEmpty(userToken)){
           //不会继续执行.... 不调服务，直接返回给客户端
           requestContext.setSendZuulResponse(false);
           //返回错误信息
           requestContext.setResponseBody("userToken is null!");
           //返回状态
           requestContext.setResponseStatusCode(401);
       }
        //继续执行服务
        return null;
    }
}
