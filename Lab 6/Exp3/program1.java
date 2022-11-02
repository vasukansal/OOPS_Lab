package Exp3;

interface I1 {
    public void sum(int a, int b);
}

class methods {
    private int pri = 1;
    int def = 2;
    protected int pro = 3;
    public int pub = 4;

}

public class program1 extends methods implements I1 {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        methods m1 = new methods();
        System.out.println("Default variable - " + m1.def);
        System.out.println("Protected variable  - " + m1.pro);
        System.out.println("Public variable - " + m1.pub);
    }
}
