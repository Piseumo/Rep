package com.green.orderservice.user.service;

import com.green.orderservice.user.vo.OrderRequestDto;
import com.green.orderservice.user.vo.OrderResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    OrderResponseDto join(OrderRequestDto orderRequestDto);
}
