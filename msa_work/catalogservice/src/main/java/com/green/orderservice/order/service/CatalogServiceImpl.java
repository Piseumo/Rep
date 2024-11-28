package com.green.orderservice.order.service;

import com.green.orderservice.order.jpa.CatalogEntity;
import com.green.orderservice.order.jpa.CatalogRepository;
import com.green.orderservice.order.vo.CatalogRequestDto;
import com.green.orderservice.order.vo.CatalogResponseDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService {

    private final CatalogRepository catalogRepository;

    @Override
    public CatalogResponseDto join(CatalogRequestDto catalogRequestDto) {
        String reqEmail = catalogRequestDto.getEmail();

        catalogRepository.findByEmail(reqEmail)
                .ifPresent(uesr-> {
                    throw new IllegalArgumentException(String.format("이미 존재하는 이메일 입니다 회원가입 안됩니다.",reqEmail));
                });

        ModelMapper modelMapper = new ModelMapper();
        CatalogEntity catalogEntity = modelMapper.map(catalogRequestDto, CatalogEntity.class);
        catalogEntity.setOrderId(UUID.randomUUID().toString());
        catalogEntity = catalogRepository.save(catalogEntity);

        CatalogResponseDto catalogResponseDto =modelMapper.map(catalogEntity, CatalogResponseDto.class);
        return catalogResponseDto;
    }
}
