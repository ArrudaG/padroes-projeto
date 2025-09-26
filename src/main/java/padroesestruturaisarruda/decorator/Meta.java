package padroesestruturaisarruda.decorator;

public class Meta extends CargoDecorator{

    public Meta(Cargo cargo) {
        super(cargo);
    }

    public float getPercentualBonificacao() {
        return 10.0f;
    }

    public String getNomeEstrutura() {
        return "Meta";
    }
}
