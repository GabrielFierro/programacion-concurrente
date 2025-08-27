package tests;

import multithread.Corredor;

public class Carrera {
    public static void main(String[] args) {
        String ganador = "";
        System.out.println("Hilo principal comienza la carrera");

        // Creo los objetos de tipo Corredor
        Corredor c1 = new Corredor("Gabriel", 0);
        Corredor c2 = new Corredor("Raul", 0);
        Corredor c3 = new Corredor("Gustavo", 0);

        // Creo un hilo para cada corredor
        Thread hiloC1 = new Thread(c1);
        Thread hiloC2 = new Thread(c2);
        Thread hiloC3 = new Thread(c3);

        // Creo un arreglo de Corredores
        Corredor[] corredores = new Corredor[3];
        corredores[0] = c1;
        corredores[1] = c2;
        corredores[2] = c3;

        // Comienza la ejecucion de los hilos corredores
        hiloC1.start();
        hiloC2.start();
        hiloC3.start();

        // Dejo en modo de espera al hilo Main para que los hilos corran la
        // carrera normalmente
        try {
            // Lo pongo dentro de un try catch para evitar la excepcion de interrupcion de
            // hilos de Thread
            hiloC1.join();
            hiloC2.join();
            hiloC3.join();
        } catch (InterruptedException exc) {
            System.out.println("Hilo interrumpido");
        }

        System.out.println("Hilo principal finalizado");

        System.out.println("\nTermino la carrera.");

        /*
         * Para saber quien fue el hilo ganador de la carrera tengo que
         * usar join para que el hilo Main espere, a que los hilos corran la carrera.
         * Por lo que, los corredores corren la carrera, y cuando termina la Carrera el
         * hilo
         * Main determina cual fue el ganador con la mayor cantidad de pasos
         */
        ganador = mostrarCorredorConMayorDistancia(corredores);

        System.out.println(ganador);
    }

    public static String mostrarCorredorConMayorDistancia(Corredor[] corredores) {
        String texto = "";
        int longitud = corredores.length;
        int pos = 0;
        int acum = corredores[0].distance;

        for (int i = 1; i < longitud; i++) {
            if (corredores[i].distance > acum) {
                acum = corredores[i].distance;
                pos = i;
            }
        }

        texto = "El corredor " + corredores[pos].name + " hizo la mayor distancia con un total de "
                + corredores[pos].distance;

        return texto;
    }
}
