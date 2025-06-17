package com.ejemplo.hola;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HolaMundoIT {
    @Test
    public void testSaludoIntegracion() {
        HolaMundo hola = new HolaMundo();
        assertTrue(hola.saludar().contains("Hola"));
    }
}
