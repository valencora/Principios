package OpenClosedPrinciple;

public class EmailMensaje extends Mensaje {
    @Override
    public void enviarMensaje(String destinatario, String contenido) {
        System.out.println("Enviando correo a " + destinatario + ": " + contenido);
    }
}