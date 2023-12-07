package com.example.spring_study_inflean.discount;

import com.example.spring_study_inflean.member.Grade;
import com.example.spring_study_inflean.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{
    private int DISCOUNTOERCENT = 10;
    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * DISCOUNTOERCENT / 100;
        } else {
            return 0;
        }
    }

}
