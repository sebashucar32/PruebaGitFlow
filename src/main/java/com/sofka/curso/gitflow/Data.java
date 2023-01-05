package com.sofka.curso.gitflow;

import java.util.Arrays;
import java.util.List;

public class Data {
    private Data() {}

    public static List<Persona> datos() {
        return Arrays.asList(new Persona(1, "Sebastian", 4000.0),
                new Persona(2, "Juancho", 10000.0), new Persona(3, "Rosa", 7500.0),
                new Persona(4, "Santiago", 5000.0), new Persona(5, "Sara", 1800.0),
                new Persona(6, "Plinio", 2000.0), new Persona(7, "Natalia", 9000.0),
                new Persona(8, "Angelica", 2000.0), new Persona(9, "Chiqui", 3500.0),
                new Persona(10, "Sandra", 1800.0), new Persona(11, "Camila", 10000.0));
    }
}
