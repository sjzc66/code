package com.light.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 大连桔子分期科技有限公司
 * @date 2018/3/12 10:29.
 */

@RestController
public class TestController {

    @GetMapping("/helloworld")
    public String helloworld() {
        return "helloworld";
    }

    @GetMapping("/helloworld2")
    public String helloworld2() {
        return "helloworld2";
    }
}
