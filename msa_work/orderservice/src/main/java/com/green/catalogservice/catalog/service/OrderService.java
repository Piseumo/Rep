package com.green.catalogservice.catalog.service;

import com.green.catalogservice.catalog.vo.OrderRequest;
import com.green.catalogservice.catalog.vo.OrderResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    OrderResponse order(OrderRequest orderRequest, String userId);
    List<OrderResponse> list(String userId);
}