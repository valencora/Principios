package SingleResponsibilityPrinciple;

public class PedidoReporte {
    public void imprimirFactura(Pedido pedido) {
        System.out.println("Factura del pedido: " + pedido.getNumeroPedido());
        System.out.println("Total: $" + pedido.getTotal());
    }
}
