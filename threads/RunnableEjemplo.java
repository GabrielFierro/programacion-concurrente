package threads;

public class RunnableEjemplo implements Runnable {
    private String name;

    public RunnableEjemplo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + this.name);
            System.out.println("Termina thread " + this.name);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableEjemplo("Maria Jose"));
        Thread t2 = new Thread(new RunnableEjemplo("Jose Maria"));

        t1.start();
        t2.start();

        // try {
        // t1.join();
        // t2.join();
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        System.out.println("Termina thread main");
    }
}
