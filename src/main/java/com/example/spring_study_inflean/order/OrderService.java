package com.example.spring_study_inflean.order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
