package main.java.proxy;

public class RealService implements ServiceInterface {
    @Override
    public void operation() {
        System.out.println("Soy la operación posta posta");
    }
}
