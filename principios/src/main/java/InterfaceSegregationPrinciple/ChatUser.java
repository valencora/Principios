package InterfaceSegregationPrinciple;

public class ChatUser implements Sender, Receiver {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
