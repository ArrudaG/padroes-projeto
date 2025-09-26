package padroesestruturaisarruda.decorator;

public class Supervisor extends CargoDecorator {

    public Supervisor(Cargo cargo) {
        super(cargo);
    }

    public float getPercentualBonificacao() {
        return 20.0f;
    }

    public String getNomeEstrutura() {
        return "Supervisor";
    }
}