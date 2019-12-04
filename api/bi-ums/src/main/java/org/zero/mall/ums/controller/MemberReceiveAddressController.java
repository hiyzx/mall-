package org.zero.mall.ums.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zero.mall.ums.model.vo.MemberReceiveAddressVo;
import org.zero.mall.ums.service.IMemberReceiveAddressService;

import java.util.List;

/**
 * <p>
 * 会员收货地址表 前端控制器
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-03
 */
@RestController
@RequestMapping("/member-receive-address")
public class MemberReceiveAddressController {

    @Autowired
    private IMemberReceiveAddressService memberReceiveAddressService;

    @GetMapping("/list")
    public List<MemberReceiveAddressVo> list(@RequestParam Long memberId) {
        return memberReceiveAddressService.listByMemberId(memberId);
    }
}

