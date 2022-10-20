//Write a program to create interface A, in this interface we have two method meth1 and meth2.Implements this interface in another class named MyClass.

import java.util.Scanner;

interface A {
    public int meth1(int a, int b);

    public int meth2(int c, int d);
}

class MyClass implements A {
    public int meth1(int a, int b) {
        return a + b;
    }

    public int meth2(int c, int d) {
        return c - d;
    }
}

public class Exp2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        MyClass obj = new MyClass();
        System.out.println("Enter the numbers for addition - ");
        a = sc.nextInt();
        b = sc.nextInt();
        int sum, diff;
        sum = obj.meth1(a, b);
        System.out.println("Enter the numbers for subtraction - ");
        c = sc.nextInt();
        d = sc.nextInt();
        diff = obj.meth2(c, d);
        System.out.println("Sum - " + sum);
        System.out.println("Difference - " + diff);
    }
}