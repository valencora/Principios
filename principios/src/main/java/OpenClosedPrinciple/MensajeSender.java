package OpenClosedPrinciple;

public class MensajeSender {
    public void enviar(Mensaje mensaje, String destinatario, String contenido) {
        mensaje.enviarMensaje(destinatario, contenido);
    }
}
