package com.example.spring_study_inflean;

import com.example.spring_study_inflean.discount.DiscountPolicy;
import com.example.spring_study_inflean.discount.FixDiscountPolicy;
import com.example.spring_study_inflean.discount.RateDiscountPolicy;
import com.example.spring_study_inflean.member.MemberRepository;
import com.example.spring_study_inflean.member.MemberService;
import com.example.spring_study_inflean.member.MemberServiceImpl;
import com.example.spring_study_inflean.member.MemoryMemberRepository;
import com.example.spring_study_inflean.order.OrderService;
import com.example.spring_study_inflean.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// @Configuration 은 싱글톤을 위해 존재한다.
@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        System.out.println("Call AppConfig.memberService 1");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        System.out.println("CallAppConfig.orderService 2");
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy()
        );
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("Call AppConfig.memberRepository 3");
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
