package org.zero.mall.ums.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.zero.mall.ums.entity.MemberReceiveAddress;
import org.zero.mall.ums.mapper.MemberReceiveAddressMapper;
import org.zero.mall.ums.model.vo.MemberReceiveAddressVo;
import org.zero.mall.ums.service.IMemberReceiveAddressService;
import org.zero.mall.ums.util.BeanHelper;

import java.util.List;

/**
 * <p>
 * 会员收货地址表 服务实现类
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-03
 */
@Service
public class MemberReceiveAddressServiceImpl extends ServiceImpl<MemberReceiveAddressMapper, MemberReceiveAddress> implements IMemberReceiveAddressService {

    @Override
    public List<MemberReceiveAddressVo> listByMemberId(Long memberId) {
        LambdaQueryWrapper<MemberReceiveAddress> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(MemberReceiveAddress::getMemberId, memberId);
        List<MemberReceiveAddress> memberReceiveAddresses = baseMapper.selectList(queryWrapper);
        return BeanHelper.copyList(memberReceiveAddresses, MemberReceiveAddressVo.class);
    }
}
