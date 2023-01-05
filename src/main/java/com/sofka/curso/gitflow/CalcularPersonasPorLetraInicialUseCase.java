package com.sofka.curso.gitflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class CalcularPersonasPorLetraInicialUseCase {
    private static List<Persona> personas = null;
    private final static Logger log = Logger.getLogger(String.valueOf(CalcularPersonasPorLetraInicialUseCase.class));

    public CalcularPersonasPorLetraInicialUseCase() {
        personas = Arrays.asList(new Persona(1, "Sebastian", 4000),
            new Persona(2, "Juancho", 10000), new Persona(3, "Rosa", 7500),
            new Persona(4, "Santiago", 5000), new Persona(5, "Sara", 1800),
            new Persona(6, "Plinio", 2000), new Persona(7, "Natalia", 9000),
            new Persona(8, "Angelica", 2000), new Persona(9, "Chiqui", 3500),
            new Persona(10, "Sandra", 1800), new Persona(11, "Camila", 10000));
    }

    public static List<Persona> calcularPersonasConNombresInicialesEnS() {
        List<Persona> personasEncontradas = new ArrayList<>();
        for (Persona persona : personas) {
            char primeraLetra = persona.getNombre().charAt(0);
            if (primeraLetra == 'C') {
                personasEncontradas.add(persona);
            }
        }
        return personasEncontradas;
    }

    public void imprimirPersonas(List<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
