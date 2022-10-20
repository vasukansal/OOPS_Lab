//Write a program to create interface named test. In this interface the member function is square.Implement this interface in arithmetic class. Create one new class called ToTestInt. In this class usethe object of arithmetic class.

import java.util.Scanner;

interface Test {
    public int square(int a);
}

class Arthimatic implements Test {
    public int square(int a) {
        return a * a;
    }
}

public class Exp1_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, ans;
        System.out.print("Enter the number - ");
        a = sc.nextInt();
        sc.close();
        Arthimatic obj = new Arthimatic();
        ans = obj.square(a);
        System.out.println("Sum - " + ans);
    }
}