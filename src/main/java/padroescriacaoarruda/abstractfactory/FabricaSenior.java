package padroescriacaoarruda.abstractfactory;

public class FabricaSenior implements FabricaAbstrata{

    @Override
    public Rebaixamento createRebaixamento() {
        return new RebaixamentoSenior();
    }

    @Override
    public Promocao createPromocao() {
        return new PromocaoSenior();
    }
}
