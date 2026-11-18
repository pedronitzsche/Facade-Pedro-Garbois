package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoTest {

    @Test
    void deveRetornarPendenciaEstoque() {
        Pedido pedido = new Pedido();
        Estoque.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.finalizar());
    }

    @Test
    void deveRetornarPendenciaPagamento() {
        Pedido pedido = new Pedido();
        Pagamento.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.finalizar());
    }

    @Test
    void deveRetornarPendenciaEntrega() {
        Pedido pedido = new Pedido();
        Entrega.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.finalizar());
    }

    @Test
    void deveFinalizarPedidoSemPendencias() {
        Pedido pedido = new Pedido();

        assertEquals(true, pedido.finalizar());
    }
}