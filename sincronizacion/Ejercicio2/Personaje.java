package sincronizacion.Ejercicio2;

public class Personaje {
    public static void main(String[] args) {
        VerificarEnergia ve = new VerificarEnergia();
        Thread Criatura = new Thread(ve, "Criatura Oscura");
        Thread Sanador = new Thread(ve, "Sanador");
        Sanador.start();
        Criatura.start();
    }
}