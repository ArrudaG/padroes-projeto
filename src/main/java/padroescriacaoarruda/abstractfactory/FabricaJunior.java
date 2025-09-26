package padroescriacaoarruda.abstractfactory;

public class FabricaJunior implements FabricaAbstrata{

    @Override
    public Rebaixamento createRebaixamento() {
        return new RebaixamentoJunior();
    }

    @Override
    public Promocao createPromocao() {
        return new PromocaoJunior();
    }
}
