package main.java.state;

import java.math.BigDecimal;

public class Encendido implements AutoState {
    private Auto auto;

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    @Override
    public void encender() {
        System.out.println("Auto ya se encuentra encendido");
    }

    @Override
    public void apagar() {
        if (this.auto.getVelocidad().compareTo(BigDecimal.ZERO) == 0) {
            this.auto.setState(new Apagado());
        } else {
            System.out.println("No se puede apagar en movimiento");
        }
    }

    @Override
    public void acelerar() {
        this.auto.setVelocidad(this.auto.getVelocidad().add(BigDecimal.TEN));
    }

    @Override
    public void frenar() {
        this.auto.setVelocidad(this.auto.getVelocidad().subtract(BigDecimal.TEN));
    }
}
