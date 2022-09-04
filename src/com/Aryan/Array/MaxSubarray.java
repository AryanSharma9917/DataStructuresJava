package com.Aryan.Array;

import java.util.Scanner;

public class MaxSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+",");
        }
        System.out.println();
        int result = arr[0];
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for(int i = 1;i<arr.length;i++)
        {
            sum[i] = Math.max(arr[i], sum[i-1] + arr[i]);
            result = Math.max(result, sum[i]);
        }

    }
}
