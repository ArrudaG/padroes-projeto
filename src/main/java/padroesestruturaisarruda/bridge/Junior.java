package padroesestruturaisarruda.bridge;

public class Junior extends Cargo{

    public Junior(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}
