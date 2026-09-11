package com.devika.jobapplicationtracker.repository;

import com.devika.jobapplicationtracker.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

    List<Application> findByStatus(String status);
}