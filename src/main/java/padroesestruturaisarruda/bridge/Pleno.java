package padroesestruturaisarruda.bridge;

public class Pleno extends Cargo{

    public Pleno(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.competencias.percentualAumento());
    }
}