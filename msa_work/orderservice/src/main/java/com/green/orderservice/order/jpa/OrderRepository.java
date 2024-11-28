package com.green.orderservice.order.jpa;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {

    List<OrderEntity> findAllByUserId(String userId);

}
