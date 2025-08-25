package com.example.demo.domain.calculate.service;

import com.example.demo.domain.calculate.dto.CalculateResDto;
import com.example.demo.domain.calculate.entity.Calculate;
import com.example.demo.domain.calculate.repository.CalculateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CalculateService {

    private final CalculateRepository calculateRepository;

    @Transactional
    public CalculateResDto saveCalculate(String name, int quantity, int unitPrice) {
        Calculate calculate = new Calculate(name, quantity, unitPrice);
        Calculate savedCalculate = calculateRepository.save(calculate);

        return new CalculateResDto(savedCalculate);
    }
}
