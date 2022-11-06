import java.util.Scanner;

public class Exp4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter your Name - ");
        str = sc.nextLine();
        sc.close();
        ocur(str);
    }

    public static void ocur(String str) {
        int len;
        len = str.length();
        int count = 0;
        if (str.indexOf('a') == -1) {
            System.out.println("No 'a' Present");
        } else {
            System.out.println("\nLocation of occurance---");
            for (int i = 0; i < len; i++) {
                if (str.charAt(i) == 'a') {
                    count++;
                    System.out.print(i + "\t");
                }

            }
            System.out.println("\nTotal Occurances - " + count);
        }
    }
}