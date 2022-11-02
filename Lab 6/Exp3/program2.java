package Exp3;

import Exp3.program1.*;

class class3 implements I1 {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }
}

class class4 extends methods {
    void display() {
        System.out.println("Default variable - " + def);
        System.out.println("Protected variable  - " + pro);
        System.out.println("Public variable - " + pub);
    }
}

public class program2 extends program1 {
    public static void main(String[] args) {
        class4 c4 = new class4();
        c4.display();
        class3 c3 = new class3();
        c3.sum(1, 2);
        program2 p2 = new program2();
        p2.sum(3, 4);
    }
}
