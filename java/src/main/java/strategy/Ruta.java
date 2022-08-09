package main.java.strategy;

// Strategy también puede ser implementado mediante una clase abstracta
public interface Ruta {
    // No será sobre diseño siempre y cuando construirRuta() tenga una complejidad considerable.
    // De lo contrario se lo considera sobre diseño.
    public void construirRuta();
}
