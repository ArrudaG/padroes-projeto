package padroesestruturaisarruda.decorator;

import org.junit.jupiter.api.Test;

import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.*;

class CargoTest {

    @Test
    void deveRetornarSalario() {
        Cargo cargo = new CargoJunior(1600.0f);

        assertEquals(1600.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioComHoraExtra() {
        Cargo cargo = new HoraExtra(new CargoJunior(1600.0f));

        assertEquals(1760.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioComHoraExtraMaisMeta() {
        Cargo cargo = new Meta(new HoraExtra(new CargoJunior(1600.f)));

        assertEquals(1936.0f, cargo.getSalario());
    }

    @Test
    void deveRetornarSalarioComHoraExtraMaisMetaMaisSupervisor() {
        Cargo cargo = new Supervisor(new Meta(new HoraExtra(new CargoJunior(1600.f))));

        assertEquals(2323.0, round(cargo.getSalario()));
    }

    @Test
    void deveRetornarEstruturaCargo() {
        Cargo cargo = new CargoJunior();

        assertEquals("Junior", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoJuniorComHoraExtra() {
        Cargo cargo = new HoraExtra(new CargoJunior());

        assertEquals("Junior/Hora extra", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComHoraExtraMaisMeta() {
        Cargo cargo = new Meta(new HoraExtra(new CargoJunior()));

        assertEquals("Junior/Hora extra/Meta", cargo.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaCargoComHoraExtraMaisMetaMaisSupervisor() {
        Cargo cargo = new Supervisor(new Meta(new HoraExtra(new CargoJunior())));

        assertEquals("Junior/Hora extra/Meta/Supervisor", cargo.getEstrutura());
    }
}