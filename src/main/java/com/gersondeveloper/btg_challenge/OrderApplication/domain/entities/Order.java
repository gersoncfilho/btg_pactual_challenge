package com.gersondeveloper.btg_challenge.OrderApplication.domain.entities;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;


@Data
public final class Order {
    private long orderId;
    private long orderCode;
    private long clientCode;
    private LocalDate createdAt;
    private List<Product> productList;
}