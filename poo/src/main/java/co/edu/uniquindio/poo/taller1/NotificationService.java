package co.edu.uniquindio.poo.taller1;

public class NotificationService {
    private NotificationFactory factory;

    public NotificationService() {
        this.factory = new NotificationFactory();
    }

    public void sendNotification(String type) {
        Notification notification = factory.createNotification(type);
        if (notification != null) {
            notification.Send();
        } else {
            System.out.println("Invalid notification type");
        }
    }
}