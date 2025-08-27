package supermercado;

public class Cliente {
    /*
     * Array de productos que ha comprado representados como enteros y a su vez,
     * ese valor entero representa el tiempo que tarda en pasar por el escaner
     * [1,3,5] => el cliente compro 3 productos, el producto 1 tarda 1 segundo, el
     * producto 2 tarda 3 segundos, el producto 3 tarda 5 segundos.
     * Por lo tanto el cajero empleo un total de 9 segundos en pasar todos los
     * productos.
     */
    private String nombre;
    private int[] carroCompra;

    public Cliente(String nombre, int[] carroCompra) {
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int[] getCarroCompra() {
        return this.carroCompra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }
}
