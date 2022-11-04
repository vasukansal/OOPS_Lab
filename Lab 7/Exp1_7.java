import java.util.Scanner;

public class Exp1_7 {
    String[] names = new String[10];
    int[] rollno = new int[10];

    public void input() {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        try {
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the name of the Student - ");
                this.names[i] = sc.next();
                System.out.print("Enter the rollno - ");
                this.rollno[i] = sc.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("Max limit of Student records is 10....");
            System.out.println("PRINTING FIRST 10 STUDENTS RECORD");
            System.out.println();
        }
        sc.close();
    }

    public void output() {
        System.out.println("Name \t Rollno");
        for (int i = 0; i < 10; i++) {

            System.out.println(this.names[i] + "\t" + this.rollno[i]);
        }

    }

    public static void main(String[] args) {
        Exp1_7 obj = new Exp1_7();
        obj.input();
        obj.output();
    }
}