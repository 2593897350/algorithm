package maopao;

import java.util.Scanner;
/*
* Fibonacci数
* Description
无穷数列1，1，2，3，5，8，13，21，34，55...称为Fibonacci数列，它可以递归地定义为
F(n)=1 ...........(n=1或n=2)
F(n)=F(n-1)+F(n-2).....(n>2)
现要你来求第n个斐波那契数。（第1个、第二个都为1)
nput
第一行是一个整数m(m<5)表示共有m组测试数据 每次测试数据只有一行，且只有一个整形数n(n<20)
Output
对每组输入n，输出第n个Fibonacci数
* */

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
