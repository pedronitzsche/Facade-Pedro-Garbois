package facade;

public class PedidoFacade {

    public static boolean verificarPendenciasFinalizacao(Pedido pedido) {

        if (Estoque.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }

        if (Pagamento.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }

        if (Entrega.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }

        return true;
    }
}