package main.java.observer;

public class InstagramUser implements MemesSuscriber {
    @Override
    public void update(Meme meme) {
        System.out.println("Update InstagramUser feed with new Meme");
    }
}
