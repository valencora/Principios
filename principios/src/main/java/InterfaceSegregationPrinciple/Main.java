package InterfaceSegregationPrinciple;

public class Main {
    public static void main(String[] args) {
        Sender userSender = new ChatUser();
        Receiver userReceiver = new ChatUser();

        userSender.sendMessage("Hello!");
        userReceiver.receiveMessage("Welcome!");

        Sender notificationSystem = new NotificationSystem();
        notificationSystem.sendMessage("System update available.");
    }
}
