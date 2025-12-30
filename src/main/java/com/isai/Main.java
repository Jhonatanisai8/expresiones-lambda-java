package com.isai;

import com.isai.logica.Mensajero;

public class Main {
    public static void main(String[] args) {
        System.out.println("Expresiones Lambda en JAVA");
      /*  Mensajero lambdaMSJ = () -> {
            System.out.println("Hola desde Lambda");
        };
        lambdaMSJ.emitirMensaje();
        Mensajero lambda02 = (nombre) -> {
            System.out.println(nombre.concat(" Hola Desde Lambda"));
        };
        lambda02.emitirMensaje("Jhonatan");
        */
        Mensajero lambdaMesanje = (nombre, edad) -> {
            System.out.println("Hola, " + nombre);
            System.out.println("Tienes " + edad + " años.");
        };

        lambdaMesanje.emitirMensaje("Eli",12);

    }
}