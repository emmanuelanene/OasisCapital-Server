package com.emmanuelanene.OasisCapital.services;

import com.emmanuelanene.OasisCapital.dtos.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);

    void sendSms();

    void sendWhatsapp();
}
