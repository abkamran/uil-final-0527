package com.uil.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uil.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
