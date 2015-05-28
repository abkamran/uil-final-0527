package com.uil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uil.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
