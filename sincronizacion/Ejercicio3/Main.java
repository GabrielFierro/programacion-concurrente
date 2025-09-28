package sincronizacion.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Jaula j = new Jaula();

        Thread Milo = new Thread(j, "Milo");
        Thread Coco = new Thread(j, "Coco");
        Thread Nala = new Thread(j, "Nala");

        Milo.start();
        Coco.start();
        Nala.start();

    }
}
