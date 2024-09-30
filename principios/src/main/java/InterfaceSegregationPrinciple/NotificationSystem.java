package InterfaceSegregationPrinciple;

public class NotificationSystem implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending notification: " + message);
    }
}