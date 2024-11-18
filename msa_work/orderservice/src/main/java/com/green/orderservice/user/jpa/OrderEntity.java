package com.green.orderservice.user.jpa;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class OrderEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50 ,unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String orderId;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false,length = 100)
    private String password;


}
