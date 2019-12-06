package org.zero.mall.pms.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import org.zero.mall.pms.entity.Catalog;
import org.zero.mall.pms.model.dto.CatalogAddDto;
import org.zero.mall.pms.model.dto.CatalogQueryDto;
import org.zero.mall.pms.model.dto.CatalogUpdateDto;

/**
 * <p>
 * 分类表 服务类
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-05
 */
public interface ICatalogService extends IService<Catalog> {

    IPage<Catalog> listByParentId(CatalogQueryDto param);

    void add(CatalogAddDto param);

    void update(CatalogUpdateDto param);
}
