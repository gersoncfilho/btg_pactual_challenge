package com.gersondeveloper.btg_challenge.OrderApplication.domain.entities;

import lombok.Data;

import java.math.BigDecimal;

@Data
public final class Product {
    private BigDecimal price;
    private String name;
    private int quantity;
}