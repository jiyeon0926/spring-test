package com.example.demo.domain.complaint.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ComplaintReqDto {

    private final String title;
    private final String content;
}
