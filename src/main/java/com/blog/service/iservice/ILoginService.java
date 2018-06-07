package com.blog.service.iservice;

import com.blog.dao.model.User;

/**
 * Created by 肖强 on 2018/6/7.
 * 登录服务
 */
public interface ILoginService {
    /**
     * 用户登录
     *
     * @param name     用户名
     * @param password 密码
     * @return 用户信息
     */
    User login(String name, String password);

}
