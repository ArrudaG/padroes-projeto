package padroesestruturaisarruda.facade;

public class Capacidade extends Setor {
    private static Capacidade capacidade = new Capacidade();

    private Capacidade() {};

    public static Capacidade getInstance() {
        return capacidade;
    }
}
