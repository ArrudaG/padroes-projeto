package padroesestruturaisarruda.facade;

public class TempoDeExperiencia extends Setor {
    private static TempoDeExperiencia tempoDeExperiencia = new TempoDeExperiencia();

    private TempoDeExperiencia() {};

    public static TempoDeExperiencia getInstance() {
        return tempoDeExperiencia;
    }
}
