package org.zero.mall.pms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zero.mall.pms.entity.BaseAttrInfo;
import org.zero.mall.pms.service.IBaseAttrInfoService;

import java.util.List;

/**
 * <p>
 * 属性表 前端控制器
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-04
 */
@RestController
@RequestMapping("/base-attr-info")
public class BaseAttrInfoController {

    @Autowired
    private IBaseAttrInfoService baseAttrInfoService;

    @GetMapping("/list")
    public List<BaseAttrInfo> list(){
        return baseAttrInfoService.list();
    }
}

