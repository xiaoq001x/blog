package com.blog.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 肖强 on 2018/5/31.
 * TestController
 */
@Controller
public class TestController {
    private  final Logger LOGGER = LogManager.getLogger(TestController.class);
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public
    @ResponseBody//注解表示该方法的返回的结果直接写入 HTTP 响应正文（ResponseBody）中
    Map get() {
        Map<String, String> map = new HashMap<>();
        map.put("s", "sad");
        LOGGER.info("sdasdasdasdas");
        return map;
    }
}
