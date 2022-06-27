package com.phone;

public class NotificationService {
    public static void main(String[] args)
    {
        FactoryMain notificationFactory = new FactoryMain();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
