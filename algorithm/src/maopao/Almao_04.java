package maopao;

import java.util.Scanner;

public class Almao_04 {

    public void fibonacci(int s) {
        int arr1[] = new int[s];
        for (int i = 2; i < s; i++) {
            arr1[0] = 1;
            arr1[1] = 1;
            arr1[i] = arr1[i - 1] + arr1[i - 2];
            if (arr1[s - 1] != 0) {
                System.out.println(arr1[s - 1]);
            }
        }

    }


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scr.nextInt();

        }
        for (int i = 0; i < n; i++) {


            Almao_04 asd = new Almao_04();
            asd.fibonacci(arr[i]);
        }

    }
}
