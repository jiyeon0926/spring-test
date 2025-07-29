package com.example.demo.domain.complaint.controller;

import com.example.demo.domain.complaint.dto.ComplaintReqDto;
import com.example.demo.domain.complaint.dto.ComplaintResDto;
import com.example.demo.domain.complaint.service.ComplaintService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/complaints")
public class ComplaintController {

    private final ComplaintService complaintService;

    @PostMapping
    public ResponseEntity<ComplaintResDto> createComplaint(@RequestBody ComplaintReqDto dto) {
        ComplaintResDto complaint = complaintService.createComplaint(dto.getTitle(), dto.getContent());

        return new ResponseEntity<>(complaint, HttpStatus.CREATED);
    }
}
