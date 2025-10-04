package com.emmanuelanene.OasisCapital.repositories;

import com.emmanuelanene.OasisCapital.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
