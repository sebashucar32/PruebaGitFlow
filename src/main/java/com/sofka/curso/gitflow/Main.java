package com.sofka.curso.gitflow;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonaUseCase personas = new PersonaUseCase();
        personas.imprimirPersonas(PersonaUseCase.calcularPersonasConNombresInicialesEnS());

        System.out.println("De aqui continua el segundo caso de uso para la otra rama");
    }
}