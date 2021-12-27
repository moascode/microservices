package com.moascode;

import com.moascode.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public void sendNotification(NotificationRequest request) {
        notificationRepository.saveAndFlush(
                Notification.builder()
                .toCustomerId(request.toCustomerId())
                .toCustomerEmail(request.toCustomerEmail())
                .sender(request.sender())
                .message(request.message())
                .sentAt(LocalDateTime.now())
                .build());
    }
}
