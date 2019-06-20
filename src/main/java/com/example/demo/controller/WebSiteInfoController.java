package com.example.demo.controller;

import com.example.demo.entity.WebSiteInfo;
import com.example.demo.iservice.IWebsiteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class WebSiteInfoController {

    protected static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @Resource
    IWebsiteService iWebsiteService;

    @ResponseBody
    @RequestMapping(value = "/website/infos", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public List<WebSiteInfo> Hello() {
        logger.debug("/website/infos");
        List<WebSiteInfo> webSiteInfos = iWebsiteService.getAllWebSiteInfo();
        logger.debug("webSiteInfos: " + webSiteInfos);
        return webSiteInfos;
    }
}
