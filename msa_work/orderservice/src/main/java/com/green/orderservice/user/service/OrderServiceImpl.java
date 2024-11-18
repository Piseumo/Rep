package com.green.orderservice.user.service;

import com.green.orderservice.user.jpa.OrderEntity;
import com.green.orderservice.user.jpa.OrderRepository;
import com.green.orderservice.user.vo.OrderRequestDto;
import com.green.orderservice.user.vo.OrderResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public OrderResponseDto join(OrderRequestDto orderRequestDto) {
        String reqEmail = orderRequestDto.getEmail();

        orderRepository.findByEmail(reqEmail)
                .ifPresent(uesr-> {
                    throw new IllegalArgumentException(String.format("이미 존재하는 이메일 입니다 회원가입 안됩니다.",reqEmail));
                });

        ModelMapper modelMapper = new ModelMapper();
        OrderEntity orderEntity = modelMapper.map(orderRequestDto, OrderEntity.class);
        orderEntity.setOrderId(UUID.randomUUID().toString());
        orderEntity = orderRepository.save(orderEntity);

        OrderResponseDto orderResponseDto =modelMapper.map(orderEntity, OrderResponseDto.class);
        return orderResponseDto;
    }
}
