package main.java.templateMethod;

import java.math.BigDecimal;

public abstract class Libro {

    private final String titulo;
    private final String autor;
    private final String edicion;
    private final BigDecimal precio;
    private final BigDecimal costoFijo;
    private BigDecimal porcentajeComision;

    protected Libro(String titulo, String autor, String edicion, BigDecimal precio, BigDecimal costoFijo, BigDecimal porcentajeComision) {
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.precio = precio;
        this.costoFijo = costoFijo;
        this.porcentajeComision = porcentajeComision;
    }

    public abstract BigDecimal costoEnvio();

    public abstract BigDecimal costoFijo();

    public abstract BigDecimal comision();

    public BigDecimal precioFinal() {
        return this.costoFijo().add(this.comision()).add(this.costoEnvio());
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getEdicion() {
        return this.edicion;
    }

    public BigDecimal getPrecio() {
        return this.precio;
    }

    public BigDecimal getCostoFijo() {
        return this.costoFijo;
    }

    public BigDecimal getPorcentajeComision() {
        return this.porcentajeComision;
    }
}
