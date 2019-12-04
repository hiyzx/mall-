package org.zero.mall.ums.service.impl;

import org.zero.mall.ums.entity.Member;
import org.zero.mall.ums.mapper.MemberMapper;
import org.zero.mall.ums.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-03
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {

}
