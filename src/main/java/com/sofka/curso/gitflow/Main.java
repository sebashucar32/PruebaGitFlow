package com.sofka.curso.gitflow;

import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) {
        CalcularPersonasPorLetraInicialUseCase personas = new CalcularPersonasPorLetraInicialUseCase();
        personas.calcularPersonasConNombresInicialesEnS();

        log.warning("De aqui continua el segundo caso de uso para la otra rama");
        CalcularPromediosUseCase promediosUseCase = new CalcularPromediosUseCase();
        Double promedio = promediosUseCase.calcularPromedioPersonas();
        log.info("El promedio de las personas es de: " + promedio);
    }
}