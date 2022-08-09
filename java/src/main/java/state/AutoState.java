package main.java.state;

// Se puede jugar también con eventos de onExit y onEnter de los distintos estados
public interface AutoState {
    public void encender();

    public void apagar();

    public void acelerar();

    public void frenar();
}
