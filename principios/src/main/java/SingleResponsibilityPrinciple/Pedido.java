package SingleResponsibilityPrinciple;

public class Pedido {
    private String numeroPedido;
    private double total;

    public Pedido(String numeroPedido, double total) {
        this.numeroPedido = numeroPedido;
        this.total = total;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public double getTotal() {
        return total;
    }
}
