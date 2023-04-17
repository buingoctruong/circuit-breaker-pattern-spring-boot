package com.edu.orderservice.service;

import com.edu.orderservice.model.Type;

public interface OrderService {
    Type getOrderByPostCode(String orderNumber);
}
