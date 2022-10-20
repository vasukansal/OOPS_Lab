
//Write a Java Program to accept 10 numbers in an array and compute the square of each number.Print the sum of these numbers.
import java.util.Scanner;

public class Exp2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemtn at index " + i + " - ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        int ans;
        ans = square(arr);
        System.out.println(ans);
    }

    public static int square(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + (arr[i] * arr[i]);
        }
        return sum;
    }
}
