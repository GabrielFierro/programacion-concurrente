package sincronizacion.Ejercicio3;

public class Hamaca {
    private boolean ocupado;

    public Hamaca() {
    }

    public boolean estaOcupado() {
        return this.ocupado;
    }

    public synchronized void descansar(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
