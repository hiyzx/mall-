package org.zero.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.zero.mall.pms.entity.AttrInfo;
import org.zero.mall.pms.model.dto.AttrInfoAddDto;
import org.zero.mall.pms.model.dto.AttrInfoUpdateDto;

import java.util.List;

/**
 * <p>
 * 属性表 服务类
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-05
 */
public interface IAttrInfoService extends IService<AttrInfo> {

    List<AttrInfo> listByCatalog(Long catalogId);

    void add(AttrInfoAddDto param);

    void update(AttrInfoUpdateDto param);

    void delete(List<Long> ids);
}
