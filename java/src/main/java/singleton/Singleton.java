package main.java.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // En caso de tener que soportar accesos concurrentes, agregar un lock por aquí
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
