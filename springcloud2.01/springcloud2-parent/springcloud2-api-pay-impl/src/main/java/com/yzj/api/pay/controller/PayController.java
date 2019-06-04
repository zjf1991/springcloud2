package com.yzj.api.pay.controller;


import com.yzj.base.RetJson;
import com.yzj.pay.IPayControllerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController implements IPayControllerService {

    @RequestMapping("/getPayInfo")
    public RetJson getPayInfo() {
        return new RetJson(0,"this is pay service",null);
    }
}
