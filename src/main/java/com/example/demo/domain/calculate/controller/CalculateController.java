package com.example.demo.domain.calculate.controller;

import com.example.demo.domain.calculate.dto.CalculateReqDto;
import com.example.demo.domain.calculate.dto.CalculateResDto;
import com.example.demo.domain.calculate.service.CalculateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculates")
@RequiredArgsConstructor
public class CalculateController {

    private final CalculateService calculateService;

    @PostMapping
    public ResponseEntity<CalculateResDto> saveCalculate(@RequestBody CalculateReqDto calculateReqDto) {
        CalculateResDto calculate = calculateService.saveCalculate(
                calculateReqDto.getName(),
                calculateReqDto.getQuantity(),
                calculateReqDto.getUnitPrice()
        );

        return new ResponseEntity<>(calculate, HttpStatus.CREATED);
    }
}
