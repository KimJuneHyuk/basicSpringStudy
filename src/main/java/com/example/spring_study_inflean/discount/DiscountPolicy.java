package com.example.spring_study_inflean.discount;

import com.example.spring_study_inflean.member.Member;

public interface DiscountPolicy {
    /**
     * @Return 할인 대상 금액
     * */
    int discount(Member member, int price);
}
