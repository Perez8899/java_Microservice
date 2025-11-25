package com.microservice.Notification_Service.controller;


import com.microservice.Notification_Service.document.Notification;
import com.microservice.Notification_Service.dto.NotificationRequest;
import com.microservice.Notification_Service.service.NotificationServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    private final NotificationServiceImpl notificationServiceImpl;

    public NotificationController(NotificationServiceImpl notificationServiceImpl) {
        this.notificationServiceImpl = notificationServiceImpl;
    }

    @PostMapping
    public ResponseEntity<Notification> createNotification(@RequestBody NotificationRequest notificationRequest) {
        return ResponseEntity.ok().body(notificationServiceImpl.createNotification(notificationRequest));
    }


}