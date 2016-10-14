package com.lqp.deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName: TestController
 * @Description:
 * @author longqingping
 * @date 2016年10月13日 下午5:24:28
 */
@Controller
@RequestMapping(path = "/test")
public class TestController {

    @RequestMapping(path = "/login", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String login() {
        return "请求成功";
    }
}
