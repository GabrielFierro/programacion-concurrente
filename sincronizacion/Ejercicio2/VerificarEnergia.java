package sincronizacion.Ejercicio2;

public class VerificarEnergia implements Runnable {

    private Energia e = new Energia();

    private void modificarEnergia(int capacidad) throws InterruptedException {
        synchronized (e) {
            String name = Thread.currentThread().getName();
            if (name.equalsIgnoreCase("Criatura Oscura")) {
                System.out.println("Se van a drenar " + capacidad + " de energia.");
                e.drenarEnergia(capacidad);
                System.out.println("Energia total: " + e.getCapacidad());
            } else if (name.equalsIgnoreCase("Sanador")) {
                System.out.println("Se va a revitalizar " + capacidad + " de energia.");
                e.revitalizarEnergia(capacidad);
                System.out.println("Energia total: " + e.getCapacidad());
            }
        }
    }

    public void run() {
        for (int i = 0; i <= 3; i++) {
            try {
                this.modificarEnergia(3);
                if (e.getCapacidad() < 0) {
                    System.out.println("Has muerto. Juego terminado!");
                }
            } catch (InterruptedException ex) {
                System.out.println("Interrumpido");
            }
        }
    }

}
