import java.util.Scanner;

public class Exp3_7 {
    public static void modules() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Operands");
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a % b);
            sc.close();
        } catch (Exception e) {
            System.out.println("Enter valid numeric  operand");
        }
    }

    public static void main(String[] args) {
        modules();
    }
}
