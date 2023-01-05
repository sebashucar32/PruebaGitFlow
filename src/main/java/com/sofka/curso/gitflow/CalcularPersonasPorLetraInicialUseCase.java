package com.sofka.curso.gitflow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class CalcularPersonasPorLetraInicialUseCase {
    private final Logger log = Logger.getLogger(String.valueOf(CalcularPersonasPorLetraInicialUseCase.class));
    private static final List<Persona> personas = Data.datos();

    public void calcularPersonasConNombresInicialesEnS() {
        personas.stream().filter(p -> p.getNombre().startsWith("C"))
                .toList().forEach(per -> log.info(per.toString()));
    }
}
