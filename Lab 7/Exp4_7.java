import java.util.Scanner;

class collision extends Exception {
    public collision(String str) {
        super(str);
    }
}

public class Exp4_7 {
    public static void check(int a, int b) throws collision {
        if (a == 0 && b == 1) {
            throw new collision("Vehicle collided");
        } else if (a == b) {
            System.out.println("No Collision");
        } else {
            throw new collision("Enter values either 0 or 1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the direction in form of 1 & 0 only --");
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        try {
            check(a, b);
        } catch (collision e) {
            System.out.println(e);
        }
    }
}
