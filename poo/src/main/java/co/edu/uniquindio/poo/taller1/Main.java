package co.edu.uniquindio.poo.taller1;

public class Main {
    public static void main(String[] args) {
        
        NotificationService service = new NotificationService();
        service.sendNotification("EMAIL");
        service.sendNotification("SMS");
    }
}