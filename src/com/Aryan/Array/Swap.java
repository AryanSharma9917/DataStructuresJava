package com.Aryan.Array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,8,7,6};
        swap(arr,1,2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int val1,int val2){
        int temp = arr[val1];
        arr[val1] = arr[val2];
        arr[val2] = temp;
        System.out.println(temp);
        System.out.println(temp);
        System.out.println(temp);


    }
}
