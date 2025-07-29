package com.example.demo.domain.complaint.service;

import com.example.demo.domain.complaint.dto.ComplaintResDto;
import com.example.demo.domain.complaint.entity.Complaint;
import com.example.demo.domain.complaint.repository.ComplaintRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ComplaintService {

    private final ComplaintRepository complaintRepository;

    @Transactional
    public ComplaintResDto createComplaint(String title, String content) {
        Complaint complaint = new Complaint(title, content);
        complaintRepository.save(complaint);

        return new ComplaintResDto(complaint);
    }
}
