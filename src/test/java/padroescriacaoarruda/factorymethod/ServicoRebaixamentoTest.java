package padroescriacaoarruda.factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoRebaixamentoTest {

    @Test
    void deveExecutarRebaixamento() {
        IServico servico = ServicoFactory.obterServico("Rebaixamento");
        assertEquals("Rebaixamento efetivado", servico.executar());
    }

    @Test
    void deveCancelarRebaixamento() {
        IServico servico = ServicoFactory.obterServico("Rebaixamento");
        assertEquals("Rebaixamento cancelado", servico.cancelar());
    }

}