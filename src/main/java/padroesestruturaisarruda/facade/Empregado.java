package padroesestruturaisarruda.facade;

public class Empregado {
    public boolean promocao() {
        return EmpregadoFacade.verificarPossivelPromocao(this);
    }
}
