package com.gersondeveloper.btg_challenge.OrderApplication.infrastructure.adapters.out.persistence.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gersondeveloper.btg_challenge.OrderApplication.domain.entities.Order;
import com.gersondeveloper.btg_challenge.OrderApplication.infrastructure.adapters.out.persistence.entities.OrderJpaEntity;

public class OrderMapper {
    private ObjectMapper mapper;

    public OrderMapper(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public OrderJpaEntity toJpaEntity(Order order) {
        return mapper.convertValue(order, OrderJpaEntity.class);
    }

    public Order toDomainEntity(OrderJpaEntity orderJpaEntity) {

        return null;
    }
}
