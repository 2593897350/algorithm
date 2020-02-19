package maopao;

import java.util.Scanner;

public class Almao_03 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scr.next();
        }

        for (int i = 0; i < n; i++) {

            char arr1[] = arr[i].toCharArray();
            if (arr1.length != 3) {
                System.out.println("输入错误");
            }
            for (int k = 0; k < arr1.length; k++) {


                for (int j = 0; j < arr1.length - 1; j++) {
                    int a = arr1[j];
                    int b = arr1[j + 1];
                    if (a > b) {
                        char temp = arr1[j];
                        arr1[j] = arr1[j + 1];
                        arr1[j + 1] = temp;
                    }


                }
            }

            for (char s : arr1) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }

}
