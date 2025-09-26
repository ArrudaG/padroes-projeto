package padroesestruturaisarruda.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupervisorTest {
    @Test
    void deveRetornarSupervisorComCurso(){
        Competencias competencias = new Curso();
        Cargo cargo = new Supervisor(3400.0f);
        cargo.setCompetencias(competencias);
        assertEquals(3400.0f, cargo.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSupervisorComEnsinoSuperior(){
        Competencias competencias = new EnsinoSuperior();
        Cargo cargo = new Supervisor(3400.0f);
        cargo.setCompetencias(competencias);
        assertEquals(3740.0f, cargo.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSupervisorComPosGraduacao(){
        Competencias competencias = new PosGraduacao();
        Cargo cargo = new Supervisor(3400.0f);
        cargo.setCompetencias(competencias);
        assertEquals(3910.0f, cargo.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSupervisorComDoutorado(){
        Competencias competencias = new Doutorado();
        Cargo cargo = new Supervisor(3400.0f);
        cargo.setCompetencias(competencias);
        assertEquals(4080.0f, cargo.calcularSalario(), 0.01f);
    }

}