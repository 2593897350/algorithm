package digui;

import java.util.Scanner;

//arr[i]*fuc(arr[i-1])
public class Aldigui_01 {


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scr.nextInt();


        }
        int sum = 1;
        for (int i = 0; i <n ; i++) {

            sum*=arr[i];
        }
        System.out.println(sum);
    }



}
