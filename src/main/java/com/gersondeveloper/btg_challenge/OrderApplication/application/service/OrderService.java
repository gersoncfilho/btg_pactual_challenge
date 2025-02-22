package com.gersondeveloper.btg_challenge.OrderApplication.application.service;

import com.gersondeveloper.btg_challenge.OrderApplication.application.ports.in.GetCustomerOrdersCountUseCase;
import com.gersondeveloper.btg_challenge.OrderApplication.application.ports.in.GetCustomerOrdersUseCase;
import com.gersondeveloper.btg_challenge.OrderApplication.application.ports.in.GetCustomerTotalOrderValueUseCase;
import com.gersondeveloper.btg_challenge.OrderApplication.application.ports.in.ProcessMessageUseCase;
import com.gersondeveloper.btg_challenge.OrderApplication.domain.entities.Order;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderService implements
        ProcessMessageUseCase,
        GetCustomerOrdersUseCase,
        GetCustomerOrdersCountUseCase,
        GetCustomerTotalOrderValueUseCase {

    @Override
    public int getCustomerOrdersCount(String customerId) {
        return 0;
    }

    @Override
    public List<Order> getCustomerOrdersList(int clientId) {
        return List.of();
    }

    @Override
    public BigDecimal getCustomerTotalOrderValue(Long orderId) {
        return null;
    }

    @Override
    public void processMessage(String orderMessage) {

    }
}
