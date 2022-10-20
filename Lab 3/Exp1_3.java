
//Write a program to accept three digits (i.e. 0 - 9) and print all its possible combinations.(For example if the three digits are 1, 2, 3 than all possible combinations are : 123, 132,213, 231, 312, 321.).
import java.util.Scanner;

public class Exp1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Enter the 3 numbers - ");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        sc.close();
        for (int i = 0; i < arr[2]; i++) {
            for (int j = 0; j < arr[1]; j++) {
                for (int k = 0; k < arr[0]; k++) {
                    if (i != j && j != k) {
                        System.out.println(arr[i] + "" + arr[j] + "" + arr[k]);
                    }
                }
            }
        }
    }

    public static void sort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }
        }
    }
}