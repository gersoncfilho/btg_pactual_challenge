package com.gersondeveloper.btg_challenge.OrderApplication.application.ports.out;

import com.gersondeveloper.btg_challenge.OrderApplication.domain.entities.Order;

import java.math.BigDecimal;
import java.util.List;

public interface LoadOrderPort {
    BigDecimal getCustomerTotalOrderValue(Long orderId);
    List<Order> getCustomerOrdersList(int clientId);
    int getCustomerOrdersCount(String customerId);
}
