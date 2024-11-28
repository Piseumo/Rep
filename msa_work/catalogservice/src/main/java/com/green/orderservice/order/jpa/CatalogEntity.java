package com.green.orderservice.order.jpa;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "catalogs")
public class CatalogEntity {

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
