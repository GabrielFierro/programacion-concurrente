package multithread;

import java.util.Random;

public class Corredor implements Runnable {
    public String name;
    public int distance;
    Random random = new Random();

    public Corredor(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public void run() {
        System.out.println("Comenzando la carrera " + name);

        try {
            while (this.distance < 100) {
                int randomInt = random.nextInt(100);
                this.distance += randomInt;

                System.out.println("El corredor " + name + " avanzo una distancia de " + distance);
                if (this.distance > 100) {
                    System.out.println("El corredor " + name + " termino la carrera");
                } else {
                    System.out.println("El corredor " + name + " descansa");
                    Thread.sleep(400);
                    System.out.println("Continua el corredor " + name);
                }
            }
        } catch (InterruptedException exc) {
            System.out.println("interrumpido");
        }
    }
}
