//Write a program to accept 10 student’s marks in an array, arrange it into ascending order, convertinto the grades and print marks and grades in the tabular form.

import java.util.Scanner;

public class Exp4_2 {
    // #4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the marks -> ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for (int i = 0; i < 10; i++) {
            if (arr[i] < 40) {
                System.out.println(arr[i] + " - Fail");
            } else if (40 <= arr[i] && arr[i] <= 50) {
                System.out.println(arr[i] + " - Only Pass");
            } else if (51 >= arr[i] && arr[i] <= 75) {
                System.out.println(arr[i] + " - Merit");
            } else {
                System.out.println(arr[i] + " - Excellent");
            }
        }

    }

    public static void sort(int[] arr) {
        int temp;
        for (int i = 1; i < 10; i++) {
            if (arr[i] > arr[i - 1]) {
                temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}