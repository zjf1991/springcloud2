package com.yzj.springbootswagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@Api("房源")
@RestController
public class SwaggerController {

    @ApiOperation("获取房源")
    @ApiImplicitParam(name = "id",value ="房源id",required = true,dataType = "String")
    @GetMapping("/getDemo/{id}")
    public Map<String,Object> getDemo(@PathVariable String id) {
        Map<String,Object> Object=new HashMap<>();
        Object.put("name","小李");
        Object.put("age",20);
        return Object;
    }

}
