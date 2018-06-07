package com.blog.utils;


import com.blog.dao.model.warp.Resp;

/**
 * Created by 肖强 on 2018/6/7.
 * 请求回复utils
 */
public class ResponseUtils implements Message {
    public static <T> Resp opSuccess(T data) {
        Resp<T> tResp = new Resp<>();
        tResp.setData(data);
        tResp.setCode(SUCCESS);
        tResp.setMsg(MSG[SUCCESS]);
        return tResp;
    }

    public static Resp opFailed() {
        Resp tResp = new Resp<>();
        tResp.setCode(FAILED);
        tResp.setMsg(MSG[FAILED]);
        return tResp;
    }
}
