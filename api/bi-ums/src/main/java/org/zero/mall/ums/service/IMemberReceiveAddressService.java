package org.zero.mall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.zero.mall.ums.entity.MemberReceiveAddress;
import org.zero.mall.ums.model.dto.MemberReceiveAddressDto;
import org.zero.mall.ums.model.vo.MemberReceiveAddressVo;

import java.util.List;

/**
 * <p>
 * 会员收货地址表 服务类
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-03
 */
public interface IMemberReceiveAddressService extends IService<MemberReceiveAddress> {

    List<MemberReceiveAddressVo> listByMemberId(Long memberId);

    void add(MemberReceiveAddressDto memberReceiveAddressDto);
}
