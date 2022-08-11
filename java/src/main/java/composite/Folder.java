package main.java.composite;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Folder implements Storable {
    private List<Storable> children;

    public Folder() {
        this.children = new ArrayList<>();
    }

    public void addChild(Storable storable) {
        this.children.add(storable);
    }

    public void removeChild(Storable storable) {
        this.children.remove(storable);
    }

    @Override
    public BigInteger getSize() {
        return this.children.stream().map(Storable::getSize).reduce(BigInteger.ZERO, BigInteger::add);
    }
}
