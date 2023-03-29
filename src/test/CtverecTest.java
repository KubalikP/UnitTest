package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import source.Ctverec;
class CtverecTest {

    @Test
    void getA() {
        Ctverec c = new Ctverec(4);
        assertEquals(4, c.getA());
    }

    @org.junit.jupiter.api.Test
    void setA() {
        fail("Missing");
    }
}