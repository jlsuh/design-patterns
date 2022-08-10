package main.java.state;

// Se puede jugar también con eventos de onExit y onEnter de los distintos estados
// Los cambios de estados se pueden manejar a nivel Contexto, o bien que cada estado sepa
// el estado siguiente.
// Si no existen comportamientos asociados a los estados, estaríamos cayendo sobre un sobrediseño. En
// dicho caso sería solamente una "marca" en el objeto (Enum).
public interface AutoState {
    public void encender();

    public void apagar();

    public void acelerar();

    public void frenar();
}
