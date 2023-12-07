package com.example.spring_study_inflean.singleton;

public class SingletonService {
//    1. static 영역에 객체를 딱 하나만 생성한다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 로직 호출");
    }
}
