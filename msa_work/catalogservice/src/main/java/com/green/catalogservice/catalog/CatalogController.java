package com.green.catalogservice.catalog;

import com.green.catalogservice.catalog.service.CatalogService;
import com.green.catalogservice.catalog.vo.CatalogRequest;
import com.green.catalogservice.catalog.vo.CatalogResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("catalog-service")
@RequiredArgsConstructor
public class CatalogController {
    private final CatalogService userService;

    @GetMapping("catalogs")
    public ResponseEntity<List<CatalogResponse>> getCatalogs() {
        return ResponseEntity.ok(userService.getCatalogs());
    }

}
