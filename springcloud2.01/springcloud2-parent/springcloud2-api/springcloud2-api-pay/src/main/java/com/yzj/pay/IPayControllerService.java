package com.yzj.pay;

import com.yzj.base.RetJson;
import org.springframework.web.bind.annotation.RequestMapping;

public interface IPayControllerService {


    @RequestMapping("/getPayInfo")
    public RetJson getPayInfo();


}
