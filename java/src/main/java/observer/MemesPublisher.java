package main.java.observer;

import java.util.ArrayList;
import java.util.List;

public class MemesPublisher {
    private List<MemesSuscriber> memesSuscriberList;

    public MemesPublisher() {
        this.memesSuscriberList = new ArrayList<>();
    }

    public void suscribe(MemesSuscriber memesSuscriber) {
        this.memesSuscriberList.add(memesSuscriber);
    }

    public void unsuscribe(MemesSuscriber memesSuscriber) {
        this.memesSuscriberList.remove(memesSuscriber);
    }

    private Meme createMeme() {
        return new Meme();
    }

    public void postMeme(Meme meme) {
        memesSuscriberList.forEach(m -> m.update(meme));
    }

    public void someOtherBusinessLogic() {
        // Yada yada
    }
}
