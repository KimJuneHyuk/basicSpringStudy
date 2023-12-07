package com.example.spring_study_inflean;

import com.example.spring_study_inflean.member.Grade;
import com.example.spring_study_inflean.member.Member;
import com.example.spring_study_inflean.member.MemberService;
import com.example.spring_study_inflean.member.MemberServiceImpl;
import com.example.spring_study_inflean.order.Order;
import com.example.spring_study_inflean.order.OrderService;
import com.example.spring_study_inflean.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {
//        JAVA 생성자 를 통한 참조 형식
//        MemberService memberService = new MemberServiceImpl();
//        OrderService orderService = new OrderServiceImpl(memberRepository, discountPolicy);

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

//        Spring @Configuration @Bean 을 통한 DI
//        ApplicationContext Interface 는 스프링 컨테이너 이다.
//        AnnotationConfigApplicationContext 는 구현체 이다.
        ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ap.getBean("memberService", MemberService.class);
        OrderService orderService = ap.getBean("orderService", OrderService.class);

        long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order );
    }
}
