package threads;

public class ThreadEjemplo extends Thread {
    public ThreadEjemplo(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            System.out.println("Termina thread " + getName());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadEjemplo t1 = new ThreadEjemplo("Maria Jose");
        ThreadEjemplo t2 = new ThreadEjemplo("Jose Maria");

        t1.start();
        t2.start();

        // Los join de abajo lo que hacen es ejecutarse y dejar en modo de espera al
        // hilo Main
        // por lo que, una vez que estos terminen ahi recien se ejecuta el hilo Main

        t1.join();
        t2.join();

        System.out.println("Termina thread main");
    }
}
