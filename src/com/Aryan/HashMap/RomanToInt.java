package com.Aryan.HashMap;

import java.util.HashMap;

public class RomanToInt {
    public int Change(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('l' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);

    }
    public static void main(String[] args) {

    }
}
