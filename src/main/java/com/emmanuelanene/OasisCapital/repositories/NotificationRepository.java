package com.emmanuelanene.OasisCapital.repositories;

import com.emmanuelanene.OasisCapital.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
