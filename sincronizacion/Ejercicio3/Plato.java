package sincronizacion.Ejercicio3;

public class Plato {
    private int cantidad = 10;

    public Plato() {
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public synchronized void comer(int cantidad) {
        this.cantidad = this.cantidad - cantidad;
    }
}
