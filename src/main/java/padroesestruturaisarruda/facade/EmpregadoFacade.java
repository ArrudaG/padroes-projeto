package padroesestruturaisarruda.facade;

public class EmpregadoFacade {

    public static boolean verificarPossivelPromocao (Empregado empregado) {
        if (Capacidade.getInstance().verificarEmpregadoCapacitado(empregado)) {
            return false;
        }
        if (Curso.getInstance().verificarEmpregadoCapacitado(empregado)) {
            return false;
        }
        if (TempoDeExperiencia.getInstance().verificarEmpregadoCapacitado(empregado)) {
            return false;
        }
        return true;
    }
}
