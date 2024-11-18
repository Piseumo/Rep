package com.green.orderservice.user.service;

import com.green.orderservice.user.vo.CatalogRequestDto;
import com.green.orderservice.user.vo.CatalogResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface CatalogService {
    CatalogResponseDto join(CatalogRequestDto catalogRequestDto);
}
