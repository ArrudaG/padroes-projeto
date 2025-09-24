package padroescriacaoarruda.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDemissaoTest {

    @Test
    void deveExecutarDemissao() {
        IServico servico = ServicoFactory.obterServico("Demissao");
        assertEquals("Demissao efetivada", servico.executar());
    }

    @Test
    void deveCancelarDemissao() {
        IServico servico = ServicoFactory.obterServico("Demissao");
        assertEquals("Demissao cancelada", servico.cancelar());
    }

}