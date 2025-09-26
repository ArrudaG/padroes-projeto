package padroesestruturaisarruda.decorator;

public class CargoJunior implements Cargo{

    public float salario;

    public CargoJunior() {
    }

    public CargoJunior(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public String getEstrutura() {
        return "Junior";
    }
}
