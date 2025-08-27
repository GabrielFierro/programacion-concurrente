package supermercado;

public class CajeroThread extends Thread {
    private String nombre;
    private Cliente cliente;
    private long initialTime = System.currentTimeMillis();

    public CajeroThread(String nombre, Cliente cliente) {
        this.nombre = nombre;
        this.cliente = cliente;
    }

    public void esperarXsegundos(int producto) {
        try {
            Thread.sleep(producto * 1000);
        } catch (InterruptedException exc) {
            System.out.println("Error al procesar el producto");
        }
    }

    public void run() {
        System.out.println(
                "El cajero " + this.nombre + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.cliente.getNombre()
                        + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1) + " del cliente " + this.cliente.getNombre()
                    + "->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        }
        System.out.println("El cajero " + this.nombre + " HA TERMINADO DE PROCESAR " + this.cliente.getNombre()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
    }
}
