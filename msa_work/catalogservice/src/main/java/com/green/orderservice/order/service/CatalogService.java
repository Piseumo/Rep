package com.green.orderservice.order.service;

import com.green.orderservice.order.vo.CatalogRequestDto;
import com.green.orderservice.order.vo.CatalogResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface CatalogService {
    CatalogResponseDto join(CatalogRequestDto catalogRequestDto);
}
