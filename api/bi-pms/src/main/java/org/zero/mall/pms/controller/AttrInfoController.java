package org.zero.mall.pms.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zero.mall.pms.entity.AttrInfo;
import org.zero.mall.pms.model.dto.AttrInfoAddDto;
import org.zero.mall.pms.model.dto.AttrInfoUpdateDto;
import org.zero.mall.pms.service.IAttrInfoService;

import java.util.List;

/**
 * <p>
 * 属性表 前端控制器
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-05
 */
@RestController
@RequestMapping("/attr-info")
public class AttrInfoController {

    @Autowired
    private IAttrInfoService attrInfoService;

    @GetMapping("/list")
    @ApiOperation("查询")
    public List<AttrInfo> list(@RequestParam Long catalogId) {
        return attrInfoService.listByCatalog(catalogId);
    }

    @PostMapping("/add")
    @ApiOperation("添加")
    public void add(@RequestBody AttrInfoAddDto param) {
        attrInfoService.add(param);
    }

    @PostMapping("/update")
    @ApiOperation("修改")
    public void update(AttrInfoUpdateDto param) {
        attrInfoService.update(param);
    }

    @PostMapping("/delete")
    @ApiOperation("删除")
    public void delete(@RequestBody List<Long> ids) {
        attrInfoService.delete(ids);
    }
}

