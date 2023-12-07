package com.example.spring_study_inflean;

import com.example.spring_study_inflean.member.Grade;
import com.example.spring_study_inflean.member.Member;
import com.example.spring_study_inflean.member.MemberService;
import com.example.spring_study_inflean.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
//        JAVA 생성자를 통한 의존성 주입 형식
//        MemberService memberService = new MemberServiceImpl();

//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();

//        Spring @Configuration @Bean 을 통한 ID 형식
//        ApplicationContext 객체를 통해 DI 된 메서드 콜.
        ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
//        getBean 으로 @Bean 등록된 메서드 사용 가능.
        MemberService memberService = ap.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + member.getName() );
        System.out.println("find Member = " + findMember.getName());
    }
}
