package com.gersondeveloper.btg_challenge.OrderApplication.infrastructure.adapters.out.persistence;

import com.gersondeveloper.btg_challenge.OrderApplication.infrastructure.adapters.out.persistence.entities.OrderJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderJpaRepository extends JpaRepository<OrderJpaEntity, Long> {
}
