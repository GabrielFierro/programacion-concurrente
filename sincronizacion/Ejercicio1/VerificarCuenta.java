package sincronizacion.Ejercicio1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VerificarCuenta implements Runnable {
    /**
     * Con la palabra reservada synchronized se sincroniza el acceso al recurso
     * compartido para lograr la exclusion mutua.
     * De esta forma, cuando cada hilo quiera acceder al balance de su cuenta
     * bancaria, va a tener que esperar que
     * los demás liberen el lock.
     * Ademas, hay que tener en cuenta que se sincroniza el recurso compartido de la
     * clase CuentaBanco, es decir, balance.
     */
    private CuentaBanco cb = new CuentaBanco();

    private void HacerRetiro(int cantidad) throws InterruptedException {
        synchronized (cb) {
            if (cb.getBalance() >= cantidad) {
                System.out
                        .println(Thread.currentThread().getName() + " esta realizando un retiro de: " + cantidad + ".");
                Thread.sleep(1000);
                cb.retiroBancario(cantidad);
                System.out.println(Thread.currentThread().getName() + ": Retiro realizado.");
                System.out.println(Thread.currentThread().getName() + ": Los fondos son de: " + cb.getBalance());
            } else {
                System.out.println("No hay suficiente dinero en la cuenta para realizar el retiro Sr. "
                        + Thread.currentThread().getName());
                System.out.println("Su saldo actual es de: " + cb.getBalance());
                Thread.sleep(1000);
            }
        } // de hacer retiro
    }

    public void run() {
        for (int i = 0; i <= 3; i++) {
            try {
                this.HacerRetiro(10);
                if (cb.getBalance() < 0) {
                    System.out.println("La cuenta esta sobregirada");
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(VerificarCuenta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
