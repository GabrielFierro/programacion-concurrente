package threads;

public class Recurso {
    public static void uso() {
        // Crea las instancias de tipo Thread
        Thread t = Thread.currentThread();
        System.out.println("en Recurso: Soy " + t.getName());
    }
}