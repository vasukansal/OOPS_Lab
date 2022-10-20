
//Write a program to create an Interface having two methods division and modules. Create a class,which overrides these methods.
import java.util.Scanner;

interface methods {
    public double division(double a, double b);

    public double modules(double a, double b);
}

class Overides implements methods {
    public double division(double a, double b) {
        return a / b;
    }

    public double modules(double c, double d) {
        return c % d;
    }

    public double modules(double e) {
        if (e < 0) {
            return e * -1;
        } else {
            return e;
        }
    }
}

public class Exp4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Overides obj = new Overides();
        double a, b, c, d, e, div, modul2, modul1;
        System.out.println("Enter the numbers for division - ");
        a = sc.nextInt();
        b = sc.nextInt();
        div = obj.division(a, b);
        System.out.println("Enter number for modules - ");
        c = sc.nextInt();
        d = sc.nextInt();
        modul2 = obj.modules(c, d);
        System.out.println("Enter the number to check its positivity");
        e = sc.nextInt();
        modul1 = obj.modules(e);
        System.out.println("division - " + div);
        System.out.println("Modules - " + modul2);
        System.out.println("Positivity - " + modul1);
    }
}
