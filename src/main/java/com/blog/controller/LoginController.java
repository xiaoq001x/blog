package com.blog.controller;

import com.blog.dao.model.User;

import com.blog.dao.model.warp.Resp;
import com.blog.service.iservice.ILoginService;
import com.blog.utils.ResponseUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 肖强 on 2018/6/6.
 * 登录控制器
 */
@Controller
public class LoginController {
    private final Logger LOGGER = LogManager.getLogger(TestController.class);

    @Autowired
    private ILoginService loginService;

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public
    @ResponseBody
    Resp login(@RequestParam(value = "name") String name,
               @RequestParam("password") String password) {
        LOGGER.info("userName:{} password:{}", name, password);
        User user = loginService.login(name, password);
        if (user == null) {
            return ResponseUtils.opFailed();
        }
        return ResponseUtils.opSuccess(user);
    }

}
