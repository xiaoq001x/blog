package com.blog.dao.irepository;

import com.blog.dao.model.User;

/**
 * Created by 肖强 on 2018/6/7.
 * 用户数据访问
 */
public interface IUserRepository {
    User find(String username);
}
