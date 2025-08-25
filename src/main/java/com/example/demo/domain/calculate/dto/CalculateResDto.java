package com.example.demo.domain.calculate.dto;

import com.example.demo.domain.calculate.entity.Calculate;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CalculateResDto {

    private final Long id;
    private final String name;
    private final int quantity;
    private final int unitPrice;
    private final int totalPrice;

    public CalculateResDto(Calculate calculate) {
        this.id = calculate.getId();
        this.name = calculate.getName();
        this.quantity = calculate.getQuantity();
        this.unitPrice = calculate.getUnitPrice();
        this.totalPrice = calculate.getTotalPrice();
    }

//    public static CalculateResDto from(Calculate calculate) {
//        return new CalculateResDto(calculate);
//    }
}
