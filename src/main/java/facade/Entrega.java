package facade;

public class Entrega extends Servico {

    private static Entrega instancia = new Entrega();

    private Entrega() {
    }

    public static Entrega getInstancia() {
        return instancia;
    }
}