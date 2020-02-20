package maopao;

/*
* 中位数
*Description
一组数据按从小到大的顺序依次排列，处在中间位置的一个数叫做中位数。

比如 1 5 10 11 9  其中位数就是9.因为排序过后，9处在中间位置。

现在给你一些数，请你求出其中位数。

Input
第一行输入一个整数T（1<=T<=1000)表示测试数据的组数。
随后的一行是一个奇数M，表示该组测试数据中共有M（1<=M<=1000)个数。 随后的一行有M个互不相同的整数，这些整数都不大于10000且不小于-10000。

Output
对于每组测试数据输出一个整数，表示这M个数的中位数。
* */

import java.util.Scanner;

public class Almao_05 {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        int n = scr.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i <n ; i++) {
            arr[i] = scr.nextInt();
            if (arr[i]%2==0){
                System.out.println("输入错误");
            }

            int arr1[] = new int[arr[i]];
            for (int j = 0; j <arr[i] ; j++) {
                arr1[j]=scr.nextInt();
                if (arr1[j]<-10000 || arr1[j]>10000){
                    System.out.println("输入错误");
                }
            }

            for (int j = 0; j <arr[i] ; j++) {
                for (int k = 0; k <arr[i] ; k++) {
                    if (i!=k &&arr1[j] == arr1[k]){
                        System.out.println("输入错误");
                        break;
                    }

                }
                break;

            }

            for (int j = 0; j <arr[i] ; j++) {
                for (int k = 0; k <arr[i]-1 ; k++) {
                    if (arr1[k]>arr1[k+1]){
                        int temp = arr1[k];
                        arr1[k] = arr1[k+1];
                        arr1[k+1]=temp;
                    }
                }
            }
            System.out.println(arr1[arr[i]/2]);
        }
    }
}
