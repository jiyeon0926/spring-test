package com.example.demo.domain.calculate.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CalculateReqDto {

    private final String name;
    private final int quantity;
    private final int unitPrice;
}
