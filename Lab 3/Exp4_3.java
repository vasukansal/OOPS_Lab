//Write a program to find the sum of all integers greater than 40 and less than 250 that are divisibleby 5.
public class Exp4_3 {
    public static void main(String[] args) {
        int sum;
        sum = 0;
        for (int i = 40; i < 251; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
