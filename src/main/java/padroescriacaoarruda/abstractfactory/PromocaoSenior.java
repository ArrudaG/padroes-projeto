package padroescriacaoarruda.abstractfactory;

public class PromocaoSenior implements Promocao{
    public String emitir(){
        return "Senior é o cargo mais alto e não pode ser promovido";
    }
}
