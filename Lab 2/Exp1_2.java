//Write a program to find the largest of 3 numbers.

import java.util.Scanner;

public class Exp1_2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers -- ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int ans = calculate(a, b, c);
        System.out.println("Biggest no. - " + ans);
    }

    public static int calculate(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c && b > a) {
            return b;
        } else {
            return c;
        }
    }
}
