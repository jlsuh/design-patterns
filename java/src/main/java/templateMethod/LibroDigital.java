package main.java.templateMethod;

import java.math.BigDecimal;

public class LibroDigital extends Libro {

    public LibroDigital(String titulo, String autor, String edicion, BigDecimal precio, BigDecimal costoFijo, BigDecimal porcentajeComision) {
        super(titulo, autor, edicion, precio, costoFijo, porcentajeComision);
    }

    @Override
    public BigDecimal costoEnvio() {
        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal costoFijo() {
        return getCostoFijo();
    }

    @Override
    public BigDecimal comision() {
        return this.getPorcentajeComision().multiply(this.costoFijo());
    }
}
