package com.isai;

import com.isai.logica.Mensajero;
import com.isai.logica.Operador;

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
        Mensajero lambdaMesanje = (nombre, edad) -> {
            System.out.println("Hola, " + nombre);
            System.out.println("Tienes " + edad + " años.");
        };

        lambdaMesanje.emitirMensaje("Eli",12);
        */

        //ejercicio con clases anonimas
        Operador suma = new Operador() {
            @Override
            public int operador(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Resultado de la suma: " + suma.operador(1, 2));
        //ejercicio con expresiones lambda
        Operador suma2 = (a, b) -> a - b;
        System.out.println("Resultado de la suma: " + suma2.operador(1, 2));
    }
}