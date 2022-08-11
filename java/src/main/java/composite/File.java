package main.java.composite;

import java.math.BigInteger;

public class File implements Storable {
    private BigInteger size;

    @Override
    public BigInteger getSize() {
        return this.size;
    }
}
