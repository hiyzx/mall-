package org.zero.mall.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.zero.mall.pms.entity.AttrValue;
import org.zero.mall.pms.mapper.AttrValueMapper;
import org.zero.mall.pms.model.dto.AttrValueAddDto;
import org.zero.mall.pms.model.dto.AttrValueUpdateDto;
import org.zero.mall.pms.service.IAttrValueService;

import java.util.List;

/**
 * <p>
 * 属性值表 服务实现类
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-05
 */
@Service
public class AttrValueServiceImpl extends ServiceImpl<AttrValueMapper, AttrValue> implements IAttrValueService {

    @Override
    public List<AttrValue> listByAttrInfoId(Long attrInfoId) {
        LambdaQueryWrapper<AttrValue> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(AttrValue::getAttrId, attrInfoId);
        return this.list(queryWrapper);
    }

    @Override
    public void add(AttrValueAddDto param) {
        AttrValue attrValue = new AttrValue();
        BeanUtils.copyProperties(param, attrValue);
        attrValue.setIsEnabled("1");
        this.save(attrValue);
    }

    @Override
    public void update(AttrValueUpdateDto param) {

    }

    @Override
    public void delete(List<Long> ids) {

    }
}
