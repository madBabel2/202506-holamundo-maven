package com.ejemplo.hola;

public class HolaMundo {
    public String saludar() {
        return "Hola, Mundo!";
    }

    public static void main(String[] args) {
        System.out.println(new HolaMundo().saludar());
    }
}
