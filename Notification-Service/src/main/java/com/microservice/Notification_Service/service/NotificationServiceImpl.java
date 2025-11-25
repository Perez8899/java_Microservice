package com.microservice.Notification_Service.service;

import com.microservice.Notification_Service.document.Notification;
import com.microservice.Notification_Service.dto.NotificationRequest;
import com.microservice.Notification_Service.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NotificationServiceImpl {

    private final NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public Notification createNotification(NotificationRequest notificationRequest) {
        Notification notificationToCreate = new Notification();
        notificationToCreate.setBody(notificationRequest.getBody());
        notificationToCreate.setCategory(notificationRequest.getCategory());
        notificationToCreate.setTitulo(notificationRequest.getTitulo());
        notificationToCreate.setUsuario(notificationRequest.getUsuario());
        notificationToCreate.setPrioridad(notificationRequest.getPrioridad());
        notificationToCreate.setEstado("PENDIENTE");
        notificationToCreate.setFechaRegistro(LocalDateTime.now());
        notificationToCreate.setNotificationIdentifier("NOT-TEST");
        return notificationRepository.save(notificationToCreate);
    }
}
