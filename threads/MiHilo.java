package threads;

public class MiHilo implements Runnable {
    String nombre;

    public MiHilo(String nombre) {
        this.nombre = nombre;
    }

    // Punto de entrada del hilo
    // Los hilos comienzan a ejecutarse aca
    public void run() {
        System.out.println("Comenzando " + nombre);

        /*
         * Si se saca el sleep para los hilos, el hilo principal termina su ejecucion
         * antes que los demas hilos
         */
        // for (int contar = 0; contar < 10; contar++) {
        // System.out.println("En " + nombre + ", el recuento " + contar);
        // }
        // System.out.println("Terminado " + nombre);

        try {
            for (int contar = 0; contar < 10; contar++) {
                Thread.sleep(400);
                System.out.println("En " + nombre + ", el recuento " + contar);
            }
        } catch (InterruptedException exc) {
            System.out.println(nombre + " interrumpido.");
        }
    }

}
