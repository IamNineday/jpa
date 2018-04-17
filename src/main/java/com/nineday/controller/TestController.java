package com.nineday.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by nineday on 2018/4/1.
 */


@RestController
public class TestController {

    @RequestMapping(value = "")
    public String test(){
        return "hello world";
    }
}