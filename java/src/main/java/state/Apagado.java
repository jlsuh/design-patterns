package main.java.state;

public class Apagado implements AutoState {
    private Auto auto;

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void encender() {
        this.auto.setState(new Encendido());
    }

    @Override
    public void apagar() {
        System.out.println("Auto ya se encuentra apagado");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar con un auto apagado no tiene efecto alguno");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar con un auto apagado no tiene efecto alguno");
    }
}
