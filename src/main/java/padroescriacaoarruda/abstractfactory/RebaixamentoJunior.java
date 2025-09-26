package padroescriacaoarruda.abstractfactory;

public class RebaixamentoJunior implements Rebaixamento{
    public String emitir(){
        return "Junior é o cargo mais baixo e não pode ser rebaixado";
    }
}
