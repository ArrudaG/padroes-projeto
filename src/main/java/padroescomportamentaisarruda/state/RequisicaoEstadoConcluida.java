package padroescomportamentaisarruda.state;

public class RequisicaoEstadoConcluida extends RequisicaoEstado{

    private RequisicaoEstadoConcluida() {}
    private static RequisicaoEstadoConcluida instance = new RequisicaoEstadoConcluida();
    public static RequisicaoEstadoConcluida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Concluída";
    }
}
