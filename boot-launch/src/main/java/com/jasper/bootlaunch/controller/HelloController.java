package com.jasper.bootlaunch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



// @RestController：处理 HTTP 请求，并将方法的返回值直接作为 HTTP 响应的内容发送给客户端，而不是视图渲染
// 这意味着方法返回的数据将以 JSON 或 XML 等格式返回给客户端，而不是 HTML 页面
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String hello(String name) {
        return "hello world --- " + name;
    }
}
