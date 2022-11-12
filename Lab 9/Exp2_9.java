class test extends Thread {
    String name;

    public test(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(this.name);
    }
}

public class Exp2_9 {
    public static void main(String[] args) {
        Thread th1 = new Thread(new test("Thread1"));
        Thread th2 = new Thread(new test("Thread2"));
        th1.start();
        th2.start();
    }
}
