package com.example.demo.dao;

import com.example.demo.entity.WebSiteInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WebSiteDao {

    List<WebSiteInfo> getAllWebSiteInfo();

}
