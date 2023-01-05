package com.sofka.curso.gitflow;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class CalcularPromediosUseCase {
    private final Logger log = Logger.getLogger(String.valueOf(CalcularPromediosUseCase.class));
    private static List<Persona> personas = Data.datos();

    public Double calcularPromedioPersonas() {
        return personas.stream()
                .map(Persona::getSueldo).toList()
                .stream().reduce(0.0, Double::sum);
    }
}
