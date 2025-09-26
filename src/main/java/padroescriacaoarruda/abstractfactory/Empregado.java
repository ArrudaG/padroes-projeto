package padroescriacaoarruda.abstractfactory;

public class Empregado {

    private Promocao promocao;
    private Rebaixamento rebaixamento;

    public Empregado (FabricaAbstrata fabrica){
        this.promocao = fabrica.createPromocao();
        this.rebaixamento = fabrica.createRebaixamento();
    }

    public String emitirPromocao(){
        return this.promocao.emitir();
    }

    public String emitirRebaixamento(){
        return this.rebaixamento.emitir();
    }
}
