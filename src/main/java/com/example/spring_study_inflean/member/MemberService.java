package com.example.spring_study_inflean.member;

import org.apache.juli.logging.Log;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
