package day03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void testEncrypts() {
        Caesar caesar = new Caesar(1);
        System.out.println(caesar.encrypts("abba"));
    }

}