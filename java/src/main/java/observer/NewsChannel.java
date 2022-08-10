package main.java.observer;

public class NewsChannel implements MemesSuscriber {
    @Override
    public void update(Meme meme) {
        System.out.println("Notify NewsChannel with new Meme");
    }
}
