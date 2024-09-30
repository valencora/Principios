package OpenClosedPrinciple;

public class SmsMensaje extends Mensaje {
    @Override
    public void enviarMensaje(String destinatario, String contenido) {
        System.out.println("Enviando SMS a " + destinatario + ": " + contenido);
    }
}