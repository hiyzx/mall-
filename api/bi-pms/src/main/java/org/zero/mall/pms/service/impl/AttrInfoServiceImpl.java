package org.zero.mall.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.BeanUtils;
import org.zero.mall.pms.entity.AttrInfo;
import org.zero.mall.pms.mapper.AttrInfoMapper;
import org.zero.mall.pms.model.dto.AttrInfoAddDto;
import org.zero.mall.pms.model.dto.AttrInfoUpdateDto;
import org.zero.mall.pms.service.IAttrInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 属性表 服务实现类
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-05
 */
@Service
public class AttrInfoServiceImpl extends ServiceImpl<AttrInfoMapper, AttrInfo> implements IAttrInfoService {

    @Override
    public List<AttrInfo> listByCatalog(Long catalogId) {
        LambdaQueryWrapper<AttrInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(AttrInfo::getCatalogId, catalogId);
        return this.list(queryWrapper);
    }

    @Override
    public void add(AttrInfoAddDto param) {
        AttrInfo attrInfo = new AttrInfo();
        BeanUtils.copyProperties(param, attrInfo);
        attrInfo.setIsEnabled("1");
        this.save(attrInfo);
    }

    @Override
    public void update(AttrInfoUpdateDto param) {
        AttrInfo attrInfo = new AttrInfo();
        BeanUtils.copyProperties(param, attrInfo);
        this.updateById(attrInfo);
    }

    @Override
    public void delete(List<Long> ids) {
        LambdaQueryWrapper<AttrInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.in(AttrInfo::getId, ids);
        AttrInfo attrInfo = new AttrInfo();
        attrInfo.setIsEnabled("0");
        this.update(attrInfo, queryWrapper);
    }
}
