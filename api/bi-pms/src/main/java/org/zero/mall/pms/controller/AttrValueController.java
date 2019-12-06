package org.zero.mall.pms.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zero.mall.pms.entity.AttrValue;
import org.zero.mall.pms.model.dto.AttrValueAddDto;
import org.zero.mall.pms.model.dto.AttrValueUpdateDto;
import org.zero.mall.pms.service.IAttrValueService;

import java.util.List;

/**
 * <p>
 * 属性值表 前端控制器
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-05
 */
@RestController
@RequestMapping("/attr-value")
public class AttrValueController {

    @Autowired
    private IAttrValueService attrValueService;

    @GetMapping("/list")
    @ApiOperation("查询")
    public List<AttrValue> list(@RequestParam Long attrInfoId) {
        return attrValueService.listByAttrInfoId(attrInfoId);
    }

    @PostMapping("/add")
    @ApiOperation("添加")
    public void add(@RequestBody AttrValueAddDto param) {
        attrValueService.add(param);
    }

    @PostMapping("/update")
    @ApiOperation("修改")
    public void update(AttrValueUpdateDto param) {
        attrValueService.update(param);
    }

    @PostMapping("/delete")
    @ApiOperation("删除")
    public void delete(@RequestBody List<Long> ids) {
        attrValueService.delete(ids);
    }
}

