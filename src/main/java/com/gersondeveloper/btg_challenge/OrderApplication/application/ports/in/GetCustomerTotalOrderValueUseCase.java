package com.gersondeveloper.btg_challenge.OrderApplication.application.ports.in;

import java.math.BigDecimal;

public interface GetCustomerTotalOrderValueUseCase {
    BigDecimal getCustomerTotalOrderValue(Long orderId);
}
