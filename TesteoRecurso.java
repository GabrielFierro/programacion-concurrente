
public class TesteoRecurso {
    public static void main(String[] args) {
        // 2 hilos de control + el main
        Cliente juan = new Cliente();
        juan.setName("Juan Lopez");
        Cliente ines = new Cliente();
        ines.setName("Ines Garcia");
        juan.start();
        ines.start();
    }
}
