package padroescriacaoarruda.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmpregadoBuilderTest {

    @Test
    void deveRetornarExcecaoEmpregadoSemCodigo() {
        try {
            EmpregadoBuilder empregadoBuilder = new EmpregadoBuilder();
            Empregado empregado = empregadoBuilder
                    .setNome("Empregado 1")
                    .setEmail("email1@email.com")
                    .build();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Codigo invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoEmpregadoSemNome() {
        try {
            EmpregadoBuilder empregadoBuilder = new EmpregadoBuilder();
            Empregado empregado = empregadoBuilder
                    .setCodigo(1)
                    .setEmail("email1@email.com")
                    .build();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarEmpregadoValido(){
        EmpregadoBuilder empregadoBuilder = new EmpregadoBuilder();
        Empregado empregado = empregadoBuilder
                .setNome("Empregado 1")
                .setCodigo(1)
                .setEmail("email1@email.com")
                .build();

        assertNotNull(empregado);
    }
}