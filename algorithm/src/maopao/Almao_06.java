package maopao;

import java.sql.SQLOutput;
import java.util.Scanner;
/*
* 白细胞是人体与疾病斗争的“卫士”。当病菌侵入人体体内时，白细胞能通过变形而穿过毛细血管壁，集中到病菌入侵部位，将病菌包围﹑吞噬。如果体内的白细胞的数量高于正常值，很可能是身体有了炎症。


现在，白细胞遇到了一群杂菌，它有n（0<n<1000）点体力，现在有m个杂菌，每个杂菌需要ai点体力去消灭（0<ai<1000）。请问，白细胞最多能消灭多少个杂菌呢？

Input
第一行有两个数n和m，分别代表白细胞的体力和杂菌数量 第二行有m个数，a0，a1,...a(m-1),分别代表消灭其需要的体力。
Output
最大能消灭多少个杂菌。
* */
public class Almao_06 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();

        int arr[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = scr.nextInt();


        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i < j && arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int count = 0;
        int sum = 0;
        for (int i = 0; i < m; i++) {

            sum += arr[i];
            count++;
            if (n == sum) {
                System.out.println(count);
                break;
            } else if (n < sum) {
                System.out.println(count - 1);

            }


        }
    }
}