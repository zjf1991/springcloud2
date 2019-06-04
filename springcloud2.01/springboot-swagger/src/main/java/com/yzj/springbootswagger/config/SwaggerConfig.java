package com.yzj.springbootswagger.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2配置
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Value("${swagger.enable}")
    private String swaggerEnable;

    //@EnableSwagger2 开启swagger2

    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.yzj.springbootswagger.controller"))
                .paths(PathSelectors.any()).build();
    }

    /**
     * 创建API文档信息
     */
    private ApiInfo apiInfo(){
        //title 文档标题
        return new ApiInfoBuilder().title("源自家APP开发文档").description("源自家APP开发文档测试版")
                .termsOfServiceUrl("wwww.baidu.com")
                .version("1.0").build();
    }
}
