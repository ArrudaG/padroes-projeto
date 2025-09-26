package padroescriacaoarruda.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpregadoTest {
    @Test
    void deveRetornarRebaixamentoJunior(){
        FabricaAbstrata fabrica = new FabricaJunior();
        Empregado empregado = new Empregado(fabrica);
        assertEquals("Junior é o cargo mais baixo e não pode ser rebaixado", empregado.emitirRebaixamento());
    }
    @Test
    void deveRetornarPromocaoJunior(){
        FabricaAbstrata fabrica = new FabricaJunior();
        Empregado empregado = new Empregado(fabrica);
        assertEquals("Junior foi promovido a Pleno", empregado.emitirPromocao());
    }
    @Test
    void deveRetornarRebaixamentoPleno(){
        FabricaAbstrata fabrica = new FabricaPleno();
        Empregado empregado = new Empregado(fabrica);
        assertEquals("Pleno rebaixado para Junior", empregado.emitirRebaixamento());
    }
    @Test
    void deveRetornarPromocaoPleno(){
        FabricaAbstrata fabrica = new FabricaPleno();
        Empregado empregado = new Empregado(fabrica);
        assertEquals("Pleno foi promovido a Senior", empregado.emitirPromocao());
    }
    @Test
    void deveRetornarRebaixamentoSenior(){
        FabricaAbstrata fabrica = new FabricaSenior();
        Empregado empregado = new Empregado(fabrica);
        assertEquals("Senior rebaixado para Pleno", empregado.emitirRebaixamento());
    }
    @Test
    void deveRetornarPromocaoSenior(){
        FabricaAbstrata fabrica = new FabricaSenior();
        Empregado empregado = new Empregado(fabrica);
        assertEquals("Senior é o cargo mais alto e não pode ser promovido", empregado.emitirPromocao());
    }


}