package com.example.demo.domain.complaint.dto;

import com.example.demo.domain.complaint.entity.Complaint;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ComplaintResDto {

    private final Long id;
    private final String complaintNo;
    private final String title;
    private final String content;

    public ComplaintResDto(Complaint complaint) {
        this.id = complaint.getId();
        this.complaintNo = complaint.getComplaintNo();
        this.title = complaint.getTitle();
        this.content = complaint.getContent();
    }
}
