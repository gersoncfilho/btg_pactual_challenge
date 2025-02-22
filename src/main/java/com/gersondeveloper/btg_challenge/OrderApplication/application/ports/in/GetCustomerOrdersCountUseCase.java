package com.gersondeveloper.btg_challenge.OrderApplication.application.ports.in;

public interface GetCustomerOrdersCountUseCase {
    int getCustomerOrdersCount(String customerId);
}
