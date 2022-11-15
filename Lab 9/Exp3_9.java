class test extends Thread {
    public synchronized void output() {
        Thread t1 = new Thread();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public void run() {
        try {
            output();
            Thread.sleep(400);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Exp3_9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            test obj = new test();
            obj.start();
        }
    }
}
