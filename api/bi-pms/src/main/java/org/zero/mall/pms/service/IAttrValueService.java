package org.zero.mall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.zero.mall.pms.entity.AttrValue;
import org.zero.mall.pms.model.dto.AttrValueAddDto;
import org.zero.mall.pms.model.dto.AttrValueUpdateDto;

import java.util.List;

/**
 * <p>
 * 属性值表 服务类
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-05
 */
public interface IAttrValueService extends IService<AttrValue> {

    List<AttrValue> listByAttrInfoId(Long attrInfoId);

    void add(AttrValueAddDto param);

    void update(AttrValueUpdateDto param);

    void delete(List<Long> ids);
}
