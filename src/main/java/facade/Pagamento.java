package facade;

public class Pagamento extends Servico {

    private static Pagamento instancia = new Pagamento();

    private Pagamento() {
    }

    public static Pagamento getInstancia() {
        return instancia;
    }
}