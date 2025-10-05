package padroesestruturaisarruda.facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Empregado> empregadoCapacitado = new ArrayList<Empregado>();

    public void addEmpregadoCapacitado (Empregado empregado) {
        this.empregadoCapacitado.add(empregado);
    }

    public boolean verificarEmpregadoCapacitado (Empregado empregado) {
        return this.empregadoCapacitado.contains(empregado);
    }
}
