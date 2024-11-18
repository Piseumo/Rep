package com.green.orderservice.user;

import com.green.orderservice.user.service.OrderService;
import com.green.orderservice.user.vo.OrderRequestDto;
import com.green.orderservice.user.vo.OrderResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("join")
    public ResponseEntity<OrderResponseDto> joinUser(@RequestBody OrderRequestDto orderRequestDto) {
        orderService.join(orderRequestDto);
        return ResponseEntity.ok(null);
    }

    @GetMapping("login")
    public ResponseEntity<String> getUser() {

        return ResponseEntity.ok(null);
    }

    @GetMapping("kakologin")
    public ResponseEntity<String> kakaoLogin() {

        return ResponseEntity.ok(null);
    }
}
