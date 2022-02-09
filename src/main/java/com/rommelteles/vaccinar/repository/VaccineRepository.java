package com.rommelteles.vaccinar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rommelteles.vaccinar.model.Vaccine;

public interface VaccineRepository extends JpaRepository<Vaccine, Long> {

}
