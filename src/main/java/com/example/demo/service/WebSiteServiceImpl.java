package com.example.demo.service;

import com.example.demo.dao.WebSiteDao;
import com.example.demo.entity.WebSiteInfo;
import com.example.demo.iservice.IWebsiteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("websiteInfoService")
public class WebSiteServiceImpl implements IWebsiteService {
    protected static Logger logger= LoggerFactory.getLogger(WebSiteServiceImpl.class);
    @Resource
    private WebSiteDao webSiteDao;

    @Override
    public List<WebSiteInfo> getAllWebSiteInfo() {
        logger.debug("getAllWebSiteInfo");
        return webSiteDao.getAllWebSiteInfo();
    }
}
