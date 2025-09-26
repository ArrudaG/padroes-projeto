package padroesestruturaisarruda.bridge;

public abstract class Cargo {

    protected Competencias competencias;

    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setCompetencias(Competencias competencias) {
        this.competencias = competencias;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
