package com.gersondeveloper.btg_challenge.OrderApplication.infrastructure.adapters.out.persistence.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class ProductJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal price;
    private String name;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderJpaEntity order;
}
