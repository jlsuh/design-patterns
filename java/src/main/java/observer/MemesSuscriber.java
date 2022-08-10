package main.java.observer;

// El hecho de tener una interfaz entre el publisher con el suscriber, hace que
// se desacople completamente el publisher con los N suscriptores
// El Cliente suscribe al publisher suscriptores que no conoce en concreto quiénes son
// y los suscriptores no conocen concretamente quién es el publisher a los cuales está suscrito

// Se debe tener en cuenta que el observer es para un volumen de suscriptores reducido. En caso de
// tener a varios suscriptores (más de 1 millón), se debería laburar con el mundo de la persistencia
// en conjunto, posterior a la notificación de la ocurrencia del evento en cuestión.

// Debido a que el criterio de ordenamiento en la emisión de los update(), no garantiza un orden,
// debemos de implementar un sistema de priorización/ordenamiento de la lista previo a la emisión,
// de los updates. En otras palabras, no es viable tener 1 millón o más de suscriptores en RAM.
public interface MemesSuscriber {
    public void update(Meme meme);
}
