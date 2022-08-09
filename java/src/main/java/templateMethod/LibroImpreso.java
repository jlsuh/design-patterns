package main.java.templateMethod;

import java.math.BigDecimal;

public class LibroImpreso extends Libro {

    public final BigDecimal costoEnvioFijo = BigDecimal.valueOf(20);

    public LibroImpreso(String titulo, String autor, String edicion, BigDecimal precio, BigDecimal costoFijo) {
        super(titulo, autor, edicion, precio, costoFijo, BigDecimal.valueOf(0.02));
    }

    @Override
    public BigDecimal costoEnvio() {
        return this.costoEnvioFijo;
    }

    @Override
    public BigDecimal costoFijo() {
        return BigDecimal.ZERO;
    }

    @Override
    public BigDecimal comision() {
        return this.getPorcentajeComision().multiply(this.getPrecio());
    }
}
