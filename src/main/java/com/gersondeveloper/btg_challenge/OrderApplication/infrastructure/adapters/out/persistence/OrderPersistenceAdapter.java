package com.gersondeveloper.btg_challenge.OrderApplication.infrastructure.adapters.out.persistence;

import com.gersondeveloper.btg_challenge.OrderApplication.application.ports.out.LoadOrderPort;
import com.gersondeveloper.btg_challenge.OrderApplication.application.ports.out.SaveOrderPort;
import com.gersondeveloper.btg_challenge.OrderApplication.domain.entities.Order;
import com.gersondeveloper.btg_challenge.OrderApplication.infrastructure.adapters.out.persistence.entities.OrderJpaEntity;
import com.gersondeveloper.btg_challenge.OrderApplication.infrastructure.adapters.out.persistence.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class OrderPersistenceAdapter implements
        LoadOrderPort,
        SaveOrderPort {

    private final OrderJpaRepository orderRepository;
    private OrderMapper orderMapper;

    @Autowired
    public OrderPersistenceAdapter(OrderJpaRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public BigDecimal getCustomerTotalOrderValue(Long orderId) {
        return null;
    }

    @Override
    public List<Order> getCustomerOrdersList(int clientId) {
        return List.of();
    }

    @Override
    public int getCustomerOrdersCount(String customerId) {
        return 0;
    }

    @Override
    public void saveOrderMessage(Order order) {
        OrderJpaEntity orderJpaEntity = orderMapper.toJpaEntity(order);
        orderRepository.save(orderJpaEntity);
    }
}
