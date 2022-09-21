package com.Aryan.Generics;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            int m=sc.nextInt();
            int arr[]=new int[m];
            for(int i=0;i<m;i++)
            {
                arr[i]=sc.nextInt();
            }
            // Arrays.sort(arr);
            Map<Integer, Integer> map = new HashMap<>();

            for (int a : arr) {
                if (map.containsKey(a)) {
                    map.put(a, map.get(a) + 1);

                } else
                    map.put(a, 1);
            }
            int count = 0;
            for (int key : map.keySet()) {
                if (map.get(key) > 1) {
                    int x=map.get(key);
                    count+=(x*(x-1))/2;
                }
            }
            System.out.println(count);
        }
    }

    // public static int ncr(int a)
    // {
    //     return fact(a) / (fact(2) *fact(a - 2));
    // }

    // public static int fact(int n)
    // {
    //     if(n==0)
    //         return 1;
    //     int res = 1;
    //     for (int i = 2; i <= n; i++)
    //         res = res * i;
    //     return res;

    // }

}