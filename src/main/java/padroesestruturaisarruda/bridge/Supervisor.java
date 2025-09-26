package padroesestruturaisarruda.bridge;

public class Supervisor extends Cargo{

    public Supervisor(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.competencias.percentualAumento());
    }
}
