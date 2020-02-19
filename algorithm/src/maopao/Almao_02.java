package maopao;

import java.util.Scanner;

public class Almao_02 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scr.next();
            char arr1[] = arr[i].toCharArray();



            int count5 = 0;

          for (int j = 0; j <arr1.length/2; j++) {


                if (arr1[arr1.length/2-1-j] == '[' && arr1[arr1.length / 2 +j] == ']' || arr1[arr1.length/2-1-j] == '(' && arr1[arr1.length / 2  + j] == ')') {
                        ++count5;
                }else {
                    System.out.println("NO");
                    break;
                }
            }
            if (count5 == arr1.length/2){
                System.out.println("YES");
            }

        }

    }
}
