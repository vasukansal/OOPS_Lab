import java.lang.*;

public class Exp4_9 extends Thread {

    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Exp4_9 th1 = new Exp4_9();
        Exp4_9 th2 = new Exp4_9();
        Exp4_9 th3 = new Exp4_9();
        Exp4_9 th4 = new Exp4_9();
        Exp4_9 th5 = new Exp4_9();
        th1.setPriority(MAX_PRIORITY);
        th2.setPriority(MIN_PRIORITY);
        th3.setPriority(NORM_PRIORITY);
        th4.setPriority(MAX_PRIORITY);
        th5.setPriority(MIN_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        System.out.println("Thead is alive - " + th1.isAlive());
        System.out.println("Thead is alive - " + th2.isAlive());
        System.out.println("Thead is alive - " + th3.isAlive());
        System.out.println("Thead is alive - " + th4.isAlive());
        System.out.println("Thead is alive - " + th5.isAlive());
    }
}
