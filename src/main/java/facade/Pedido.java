package facade;

public class Pedido {

    public boolean finalizar() {
        return PedidoFacade.verificarPendenciasFinalizacao(this);
    }
}