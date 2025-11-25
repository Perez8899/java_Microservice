package com.microservice.Notification_Service.repository;

import com.microservice.Notification_Service.document.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
}
