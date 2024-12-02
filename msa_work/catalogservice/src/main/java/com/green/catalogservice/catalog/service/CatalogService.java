package com.green.catalogservice.catalog.service;

import com.green.catalogservice.catalog.vo.CatalogRequest;
import com.green.catalogservice.catalog.vo.CatalogResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CatalogService {

    List<CatalogResponse> getCatalogs();
    CatalogResponse modifyCatalog(CatalogRequest catalogRequest);
}
