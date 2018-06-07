package com.blog.service.service;

import com.blog.dao.irepository.IUserRepository;
import com.blog.dao.model.User;
import com.blog.service.iservice.ILoginService;
import com.blog.utils.Md5Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xx on 2018/6/7.
 * 登录服务
 */
@Service
public class LoginService implements ILoginService {
    private final Logger LOGGER = LogManager.getLogger(ILoginService.class);

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User login(String name, String password) {
        User user = userRepository.find(name);
        if (user == null)
            return null;
        String dpassword = user.getPassword();
        String deCodeP = Md5Utils.MD5(password + name);
        LOGGER.info("password {}, DB {} ,afterEncode {} ", password, dpassword, deCodeP);
        if (dpassword.equals(deCodeP))
            return user;
        else return null;

    }

}
