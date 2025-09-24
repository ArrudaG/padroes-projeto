package padroescriacaoarruda.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoContratacaoTest {

    @Test
    void deveExecutarContratacao() {
        IServico servico = ServicoFactory.obterServico("Contratacao");
        assertEquals("Contratacao efetivada", servico.executar());
    }

    @Test
    void deveCancelarContratacao() {
        IServico servico = ServicoFactory.obterServico("Contratacao");
        assertEquals("Contratacao cancelada", servico.cancelar());
    }
}