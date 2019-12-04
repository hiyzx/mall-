package org.zero.mall.ums.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.zero.mall.ums.BaseTest;
import org.zero.mall.ums.entity.Member;

import java.util.List;

/**
 * @author yezhaoxing
 * @date 2019/12/3
 */
public class IMemberServiceTest extends BaseTest {

    @Autowired
    private IMemberService memberService;

    @Test
    public void list() {
        List<Member> list = memberService.list();
    }
}