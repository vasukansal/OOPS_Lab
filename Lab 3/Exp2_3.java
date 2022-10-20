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
