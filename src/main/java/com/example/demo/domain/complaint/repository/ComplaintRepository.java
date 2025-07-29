package com.example.demo.domain.complaint.repository;

import com.example.demo.domain.complaint.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
}
