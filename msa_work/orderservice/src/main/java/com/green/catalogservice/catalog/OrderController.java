package com.green.catalogservice.catalog;

import com.green.catalogservice.catalog.service.OrderService;
import com.green.catalogservice.catalog.vo.OrderRequest;
import com.green.catalogservice.catalog.vo.OrderResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order-service")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    // 해당하는 사용자 주문하기
    @PostMapping("/{userId}/order")
    public ResponseEntity<OrderResponse> userOrder(@PathVariable String userId,
                                                   @RequestBody OrderRequest orderRequest) {
        OrderResponse orderResponse = orderService.order(orderRequest, userId);
        return ResponseEntity.ok(orderResponse);
    }

    // 해당하는 사용자 주문목록보기
    @GetMapping("/{userId}/list")
    public ResponseEntity<List<OrderResponse>> userOrders(@PathVariable String userId) {
        List<OrderResponse> orderResponses = orderService.list(userId);
        return ResponseEntity.ok(orderResponses);
    }


}
