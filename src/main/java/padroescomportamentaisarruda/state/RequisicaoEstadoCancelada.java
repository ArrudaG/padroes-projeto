package padroescomportamentaisarruda.state;

public class RequisicaoEstadoCancelada extends RequisicaoEstado{

    private RequisicaoEstadoCancelada() {}
    private static RequisicaoEstadoCancelada instance = new RequisicaoEstadoCancelada();
    public static RequisicaoEstadoCancelada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelada";
    }
}
