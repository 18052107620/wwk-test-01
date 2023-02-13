package com.wwk.controller;

import com.wwk.entity.AttrGroupEntity;
import com.wwk.dao.service.AttrGroupService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private AttrGroupService attrGroupService;



    @RequestMapping("/test02")
    public List<AttrGroupEntity> test02() {
        List<AttrGroupEntity> attrGroupEntities = attrGroupService.list();
        return attrGroupEntities;
    }

    @RequestMapping("/test01")
    public String test01() {
        return "123";
    }
}
