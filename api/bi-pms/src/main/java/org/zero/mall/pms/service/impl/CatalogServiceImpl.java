package org.zero.mall.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.zero.mall.pms.entity.Catalog;
import org.zero.mall.pms.mapper.CatalogMapper;
import org.zero.mall.pms.model.dto.CatalogAddDto;
import org.zero.mall.pms.model.dto.CatalogQueryDto;
import org.zero.mall.pms.model.dto.CatalogUpdateDto;
import org.zero.mall.pms.service.ICatalogService;

/**
 * <p>
 * 分类表 服务实现类
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-05
 */
@Service
public class CatalogServiceImpl extends ServiceImpl<CatalogMapper, Catalog> implements ICatalogService {

    @Override
    public IPage<Catalog> listByParentId(CatalogQueryDto param) {
        LambdaQueryWrapper<Catalog> queryWrapper = new LambdaQueryWrapper<>();
        Long parentId = param.getParentId();
        if (parentId == null) {
            queryWrapper.isNull(Catalog::getParentId);
        } else {
            queryWrapper.eq(Catalog::getParentId, parentId);
        }
        return baseMapper.selectPage(new Page<>(param.getCurrentPage(), param.getPageSize()), queryWrapper);
    }

    @Override
    public void add(CatalogAddDto param) {
        Long parentId = param.getParentId();
        if (parentId != null) {
            Catalog parentCatalog = this.getById(parentId);
            if (parentCatalog == null) {
                throw new RuntimeException("");
            }
            if ((parentCatalog.getType() + 1) != param.getType()) {
                throw new RuntimeException("");
            }
        }
        Catalog catalog = new Catalog();
        BeanUtils.copyProperties(param, catalog);
        this.save(catalog);
    }

    @Override
    public void update(CatalogUpdateDto param) {
        Catalog catalog = new Catalog();
        BeanUtils.copyProperties(param, catalog);
        this.updateById(catalog);
    }
}
