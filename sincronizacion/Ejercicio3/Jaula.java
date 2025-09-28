package sincronizacion.Ejercicio3;

public class Jaula implements Runnable {

    private Hamaca h = new Hamaca();
    private Rueda r = new Rueda();
    private Plato p = new Plato();

    // Colores ANSI
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    private void iniciarActividades() throws InterruptedException {

        synchronized (p) {
            System.out.println(RED + Thread.currentThread().getName() + " empieza a comer." + RESET);
            p.comer(4);
            Thread.sleep(2000);
            System.out.println(GREEN + Thread.currentThread().getName() + " deja de comer." + RESET);
        }
        synchronized (r) {
            System.out
                    .println(BLUE + Thread.currentThread().getName() + " esta haciendo ejercicio en la rueda." + RESET);
            r.hacerEjercicio(true);
            Thread.sleep(2000);
            System.out.println(YELLOW + Thread.currentThread().getName() + " deja de hacer ejercicios." + RESET);
            r.hacerEjercicio(false);
        }
        synchronized (h) {
            System.out.println(RED + Thread.currentThread().getName() + " esta durmiendo en la hamaca." + RESET);
            h.descansar(true);
            Thread.sleep(2000);
            System.out.println(GREEN + Thread.currentThread().getName() + " se despierta." + RESET);
            h.descansar(false);
        }
    }

    public void run() {
        for (int i = 0; i <= 3; i++) {
            try {
                this.iniciarActividades();
                if (p.getCantidad() < 0) {
                    System.out.println(RED + "No queda mas comida. " + Thread.currentThread().getName()
                            + " no puede comer." + RESET);
                }
                if (r.estaOcupado()) {
                    System.out
                            .println(YELLOW + "La rueda esta ocupada por: " + Thread.currentThread().getName() + RESET);
                }
                if (h.estaOcupado()) {
                    System.out.println(BLUE + "La cama esta ocupada por: " + Thread.currentThread().getName() + RESET);
                }
            } catch (InterruptedException ex) {
                System.out.println(RED + "Interrumpido" + RESET);
            }
        }
    }
}
