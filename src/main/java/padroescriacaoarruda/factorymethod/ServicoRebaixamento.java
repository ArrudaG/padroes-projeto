package padroescriacaoarruda.factorymethod;

public class ServicoRebaixamento implements IServico{

    public String executar() {
        return "Rebaixamento efetivado";
    }

    public String cancelar() {
        return "Rebaixamento cancelado";
    }
}
