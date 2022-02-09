package com.rommelteles.vaccinar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rommelteles.vaccinar.model.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long>{

}
