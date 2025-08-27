package excepciones;

public class Vectores {
    public static double acceso_por_indice(double[] v, int j)
            throws IndexOutOfBoundsException {
        try {
            if ((0 <= j) && (j <= v.length)) {
                return v[j];
            } else {
                throw new RuntimeException("El indice " + j + " no existe en el vector");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }

    // Desde el siguiente cliente “main”:
    public static void main(String[] args) {
        double[] v = new double[15];
        acceso_por_indice(v, 16);
    }

    // manejo de try catch finally, ver todas las variantes
    // try catch del mas especifico al mas general ya que los algoritmos se ejecutan de forma secuencial
    // el error mas concreto es el que va primero

    /* Hilos:
     se cae un hilo (sin memoria, o queria hacer algo como acceder a internet y no tenia conexion wifi) excepciones hay muchas q no podemos controlar
     en la materia vamos a controlar como manejar los errores
    **/

}
