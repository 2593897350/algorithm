package maopao;

import java.util.Scanner;
/*
* 括号配对问题
* Description
* 现在，有一行括号序列，请你检查这行括号是否配对
* input
* 第一行输入一个数N
* output
* 每组输入数据的输出占一行，如果该字符串中所含的括号是配对的，则输出Yes,如果不配对则输出No
* */

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
