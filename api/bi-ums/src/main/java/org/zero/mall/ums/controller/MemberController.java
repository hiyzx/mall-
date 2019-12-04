package org.zero.mall.ums.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zero.mall.ums.entity.Member;
import org.zero.mall.ums.service.IMemberService;

import java.util.List;

/**
 * <p>
 * 会员表 前端控制器
 * </p>
 *
 * @author hiyzx
 * @since 2019-12-03
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private IMemberService memberService;

    @GetMapping("/list")
    public List<Member> list(){
        return memberService.list();
    }
}

