package com.example.demo.controller;

import com.example.demo.entity.MyJson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    protected static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @ResponseBody
    @RequestMapping(value = "/body/data", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public MyJson Hello() {
        logger.debug("/body/data hello");
        MyJson myJson = new MyJson();
        myJson.name = "test的例子";
        myJson.email = "xxx.com";
        return myJson;
    }
}

