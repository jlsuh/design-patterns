package main.java.state;

import java.math.BigDecimal;

public class Auto {
    private AutoState state;
    private BigDecimal velocidad;

    public Auto(AutoState estadoInicial) {
        this.state = estadoInicial;
        this.velocidad = BigDecimal.ZERO;
    }

    public void setState(AutoState nuevoEstado) {
        this.state = nuevoEstado;
    }

    public void setVelocidad(BigDecimal velocidad) {
        this.velocidad = velocidad;
    }

    public BigDecimal getVelocidad() {
        return this.velocidad;
    }

    public void acelerar() {
        this.state.acelerar();
    }

    public void frenar() {
        this.state.frenar();
    }
}
