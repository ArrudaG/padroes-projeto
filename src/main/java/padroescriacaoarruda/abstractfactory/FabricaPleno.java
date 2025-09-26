package padroescriacaoarruda.abstractfactory;

public class FabricaPleno implements FabricaAbstrata{

    @Override
    public Rebaixamento createRebaixamento() {
        return new RebaixamentoPleno();
    }

    @Override
    public Promocao createPromocao() {
        return new PromocaoPleno();
    }
}
