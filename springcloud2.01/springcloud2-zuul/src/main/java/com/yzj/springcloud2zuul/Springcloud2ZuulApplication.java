package com.yzj.springcloud2zuul;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableSwagger2Doc
public class Springcloud2ZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud2ZuulApplication.class, args);
    }

    /**
     * 刷新zuul配置
     * @return
     */
    @RefreshScope
    @ConfigurationProperties(prefix="zuul")
    public ZuulProperties zuulProperties() {
        return new ZuulProperties();
    }


    /**
     * swagger配置类
     * 添加文档来源
     */
    @Component
    @Primary
    public class SwaggerConfig implements SwaggerResourcesProvider {


        @Override
        public List<SwaggerResource> get() {
            List resources=new ArrayList();
            resources.add(swaggerResource("app-yzj-member","/api-member/v2/api-docs","2.0"));
            resources.add(swaggerResource("app-yzj-order","/api-order/v2/api-docs","2.0"));
            return resources;
        }
        private SwaggerResource swaggerResource(String name,String location,String version){
            SwaggerResource swaggerResource=new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }

}
