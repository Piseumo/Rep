package com.green.orderservice.order.vo;

import lombok.Data;

@Data
public class OrderRequest {

    private String productId;
    private Integer qty;
    private Integer unitPrice;
//    private Integer totalPrice;
}
