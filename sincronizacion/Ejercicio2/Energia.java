package sincronizacion.Ejercicio2;

public class Energia {
    private int capacidad = 10;

    public Energia() {

    }

    public int getCapacidad() {
        return capacidad;
    }

    public synchronized void drenarEnergia(int capacidad) {
        this.capacidad = this.capacidad - capacidad;
    }

    public synchronized void revitalizarEnergia(int capacidad) {
        this.capacidad = this.capacidad + capacidad;
    }
}
