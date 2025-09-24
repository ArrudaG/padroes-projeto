package padroescriacaoarruda.factorymethod;

public class ServicoContratacao implements IServico{

    public String executar() {
        return "Contratacao efetivada";
    }

    public String cancelar() {
        return "Contratacao cancelada";
    }
}
