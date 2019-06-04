package com.yzj.base;


/**
 * JSON返回对象
 */
public class RetJson {


    /**
     * 状态码
     */
    public int ret;

    /**
     * 返回信息
     */
    public String msg;

    /**
     * 返回数据
     */
    public Object data;

    public RetJson(int ret, String msg, Object data) {
        this.ret = ret;
        this.msg = msg;
        this.data = data;
    }

    public RetJson() {

    }
}
