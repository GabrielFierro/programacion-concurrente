package sincronizacion.Ejercicio3;

public class Rueda {
    private boolean ocupado;

    public Rueda() {
    }

    public boolean estaOcupado() {
        return this.ocupado;
    }

    public synchronized void hacerEjercicio(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
