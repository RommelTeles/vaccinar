package com.rommelteles.vaccinar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rommelteles.vaccinar.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
