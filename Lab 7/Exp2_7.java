import java.util.Scanner;

public class Exp2_7 {
    public static void input(int a, int b) {
        try {
            int c = a / b;
            System.out.println("Answer - " + c);
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("!!! Division by zero is not possible !!!");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter numbers for division - ");
        a = sc.nextInt();
        b = sc.nextInt();
        input(a, b);
    }
}
