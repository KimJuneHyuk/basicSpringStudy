package com.example.spring_study_inflean.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
