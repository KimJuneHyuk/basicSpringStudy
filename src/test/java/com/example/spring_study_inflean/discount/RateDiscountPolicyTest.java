package com.example.spring_study_inflean.discount;

import com.example.spring_study_inflean.member.Grade;
import com.example.spring_study_inflean.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RateDiscountPolicyTest {
    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인 적용")
    void vip_o() {
//        given
        Member member = new Member(1L, "memberVIP", Grade.VIP);
//        when
        int discount =discountPolicy.discount(member, 10000);
//        then
        Assertions.assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 없다.")
    void vip_x() {
//        given
        Member member = new Member(2L, "memberBASIC", Grade.BASIC);
//        when
        int discount =discountPolicy.discount(member, 10000);
//        then
        Assertions.assertThat(discount).isEqualTo(0);
    }
}
