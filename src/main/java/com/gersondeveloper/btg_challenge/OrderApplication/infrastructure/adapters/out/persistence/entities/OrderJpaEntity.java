package com.gersondeveloper.btg_challenge.OrderApplication.infrastructure.adapters.out.persistence.entities;

import com.gersondeveloper.btg_challenge.OrderApplication.domain.entities.Product;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")
public class OrderJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long orderCode;
    private long clientCode;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Product> productList;
    private LocalDate createdAt;
}
