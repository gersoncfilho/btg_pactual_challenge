package com.gersondeveloper.btg_challenge.OrderApplication.application.ports.in;

import com.gersondeveloper.btg_challenge.OrderApplication.domain.entities.Order;

import java.util.List;

public interface GetCustomerOrdersUseCase {
    List<Order> getCustomerOrdersList(int clientId);
}
