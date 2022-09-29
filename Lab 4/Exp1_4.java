//Write a Java program to show that private member of a super class cannot be accessed from derivedclasses.
class parent {
    static private int a = 10;
}

public class Exp1_4 extends parent {
    public static void main(String[] args) {
        int b = a;
        System.out.print(b);
    }
    // parent.a is not visible
}