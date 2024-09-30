package SingleResponsibilityPrinciple;

public class PedidoProcesador {
    public void procesarPago(Pedido pedido) {
        System.out.println("Procesando el pago del pedido: " + pedido.getNumeroPedido());
    }

    public void enviarPedido(Pedido pedido) {
        System.out.println("Enviando el pedido: " + pedido.getNumeroPedido());
    }
}
