package com.sofka.curso.gitflow;

import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger(String.valueOf(Main.class));
    public static void main(String[] args) {
        CalcularPersonasPorLetraInicialUseCase personas = new CalcularPersonasPorLetraInicialUseCase();
        personas.imprimirPersonas(CalcularPersonasPorLetraInicialUseCase.calcularPersonasConNombresInicialesEnS());

        log.info("De aqui continua el segundo caso de uso para la otra rama");
        CalcularPromediosUseCase promediosUseCase = new CalcularPromediosUseCase();
        promediosUseCase.calcularPromedioPersonas();
    }
}