package padroesestruturaisarruda.decorator;

public class HoraExtra extends CargoDecorator {

    public HoraExtra(Cargo cargo) {
        super(cargo);
    }

    public float getPercentualBonificacao() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Hora extra";
    }
}
