package com.gersondeveloper.btg_challenge.OrderApplication.application.ports.out;

import com.gersondeveloper.btg_challenge.OrderApplication.domain.entities.Order;

public interface SaveOrderPort {
    void saveOrderMessage(Order order);
}
