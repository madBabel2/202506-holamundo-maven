package com.ejemplo.hola;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HolaMundoTest {
    @Test
    public void testSaludar() {
        HolaMundo hola = new HolaMundo();
        assertEquals("Hola, Mundo!", hola.saludar());
    }
}
