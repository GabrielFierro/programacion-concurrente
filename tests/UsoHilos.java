package tests;

import threads.MiHilo;

public class UsoHilos {
    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");

        // Primero, construye un objeto de tipo MiHilo
        MiHilo mh = new MiHilo("#1");

        // Luego, construye un hilo de ese objeto
        Thread nuevoHilo = new Thread(mh);

        // Finalmente, comienza la ejecucion del hilo
        nuevoHilo.start();

        for (int i = 0; i < 50; i++) {
            System.out.println(" .");
        }
        try {
            Thread.sleep(300);
        } catch (InterruptedException exc) {
            System.out.println("Hilo principal interrumpido.");
        }
        System.out.println("Hilo principal finalizado.");
    }
}
