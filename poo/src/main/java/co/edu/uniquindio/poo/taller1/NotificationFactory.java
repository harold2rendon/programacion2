package co.edu.uniquindio.poo.taller1;

public class NotificationFactory {
    public Notification createNotification(String type) {
        switch (type) {
            case "EMAIL":
                return new Email();
            case "SMS":
                return new SMS();
            default:
                return null;
        }
    }
}