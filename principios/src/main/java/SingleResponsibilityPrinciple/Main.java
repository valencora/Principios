package SingleResponsibilityPrinciple;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("ORD1234", 250.0);

        PedidoProcesador procesador = new PedidoProcesador();
        PedidoReporte reporte = new PedidoReporte();

        procesador.procesarPago(pedido);  // Procesa el pago
        procesador.enviarPedido(pedido);  // Envía el pedido
        reporte.imprimirFactura(pedido);  // Genera el reporte
    }
}
