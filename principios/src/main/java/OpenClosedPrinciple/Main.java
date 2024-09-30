package OpenClosedPrinciple;

public class Main {
    public static void main(String[] args) {
        Mensaje email = new EmailMensaje();
        Mensaje sms = new SmsMensaje();

        MensajeSender sender = new MensajeSender();

        sender.enviar(email, "juan@example.com", "Hola, ¿cómo estás?");
        sender.enviar(sms, "555-1234", "Hola, ¿cómo estás?");
    }
}
