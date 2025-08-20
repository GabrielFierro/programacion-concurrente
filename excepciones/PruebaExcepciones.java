package excepciones;

import java.io.*;

public class PruebaExcepciones {
    private static int ingresarEdad() throws IOException {
        System.out.println("Ingrese la edad de una persona");
        throw new IOException();
    }

    public static void ruleta(int numero) throws Exception {
        System.out.println("Ingrese un numero de la ruleta");
    }

    public static void main(String[] args) {
        try {
            System.out.println(ingresarEdad());
        } catch (Exception e) {
            System.out.println("Excepcion:" + e);
        }
    }
}
