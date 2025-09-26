package padroesestruturaisarruda.decorator;

public abstract class CargoDecorator implements Cargo {

    private Cargo cargo;
    public String estrutura;

    public CargoDecorator(Cargo cargo) {
        this.cargo = cargo;
    }

    public Cargo getBonificacao() {
        return cargo;
    }

    public void setBonificacao() {
        this.cargo = cargo;
    }

    public abstract float getPercentualBonificacao();

    public float getSalario() {
        return this.cargo.getSalario() * (1 + (this.getPercentualBonificacao() / 100));
    }

    public abstract String getNomeEstrutura();

    public String getEstrutura() {
        return this.cargo.getEstrutura() + "/" + this.getNomeEstrutura();
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }
}
