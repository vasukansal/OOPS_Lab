
class task {
    public void output() {
        System.out.println("Parent Class");
    }
}

class task2 extends task implements Runnable {
    public void run() {
        System.out.println("Runnable Thread");
    }
}

public class Exp1_9 {

    public static void main(String[] args) {

        Runnable obj = new task2();
        Thread thread = new Thread(obj);
        thread.start();
        task t1 = new task();
        t1.output();
    }
}
