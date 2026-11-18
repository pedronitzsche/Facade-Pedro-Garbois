package facade;

public class Estoque extends Servico {

    private static Estoque instancia = new Estoque();

    private Estoque() {
    }

    public static Estoque getInstancia() {
        return instancia;
    }
}