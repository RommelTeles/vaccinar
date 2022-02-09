package com.rommelteles.vaccinar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rommelteles.vaccinar.model.CustomerVaccine;

@Repository
public interface CustomerVaccineRepository extends JpaRepository<CustomerVaccine, Long> {

}
