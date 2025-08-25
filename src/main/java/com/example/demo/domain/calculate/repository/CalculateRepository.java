package com.example.demo.domain.calculate.repository;

import com.example.demo.domain.calculate.entity.Calculate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculateRepository extends JpaRepository<Calculate, Long> {
}
