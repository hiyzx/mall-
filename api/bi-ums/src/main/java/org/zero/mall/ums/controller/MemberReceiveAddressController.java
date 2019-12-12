package org.zero.mall.ums.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zero.mall.ums.model.dto.MemberReceiveAddressDto;
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

    @PostMapping("/add")
    public void add(@RequestBody MemberReceiveAddressDto memberReceiveAddressDto) {
        memberReceiveAddressService.add(memberReceiveAddressDto);
    }
}

