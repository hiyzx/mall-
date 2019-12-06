package org.zero.mall.pms.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zero.mall.pms.entity.Catalog;
import org.zero.mall.pms.model.dto.CatalogAddDto;
import org.zero.mall.pms.model.dto.CatalogQueryDto;
import org.zero.mall.pms.model.dto.CatalogUpdateDto;
import org.zero.mall.pms.service.ICatalogService;

import java.util.List;

/**
 * <p>
 * 分类表 前端控制器
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-05
 */
@RestController
@RequestMapping("/catalog")
@Api(description = "分类")
public class CatalogController {

    @Autowired
    private ICatalogService catalogService;

    @GetMapping("/list")
    @ApiOperation("查询")
    public IPage<Catalog> list(CatalogQueryDto param) {
        return catalogService.listByParentId(param);
    }

    @PostMapping("/add")
    @ApiOperation("添加")
    public void add(@RequestBody CatalogAddDto param) {
        catalogService.add(param);
    }

    @PostMapping("/update")
    @ApiOperation("修改")
    public void update(CatalogUpdateDto param) {
        catalogService.update(param);
    }

    @PostMapping("/delete")
    @ApiOperation("删除")
    public void delete(@RequestBody List<Integer> ids) {
        catalogService.removeByIds(ids);
    }
}

