package padroesestruturaisarruda.bridge;

public class Senior extends Cargo{

    public Senior(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.competencias.percentualAumento());
    }
}
