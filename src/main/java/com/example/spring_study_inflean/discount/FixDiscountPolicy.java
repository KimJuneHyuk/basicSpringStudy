package com.example.spring_study_inflean.discount;

import com.example.spring_study_inflean.member.Grade;
import com.example.spring_study_inflean.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private int DISCOUNTFIXAMOUNT = 1000; //고정 할인.

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return DISCOUNTFIXAMOUNT;
        } else {
            return 0;
        }
    }
}
