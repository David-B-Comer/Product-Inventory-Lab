package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerTest {

    private Sneaker testSneaker;

    @Test
    public void setNameTest() {
        String expected = "OZWEEGO";

        testSneaker = new Sneaker();
        testSneaker.setName(expected);

        Assertions.assertEquals(expected, testSneaker.getName());
    }
}
