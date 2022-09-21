package com.Aryan.Array;
//import java.util.Scanner;
class FinalValue {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for(int i = 0;i<accounts.length;i++){
            int tsum = 0;
            for(int j=0;j<accounts[i].length;j++){
                tsum += accounts[i][j];
            }
            // return tsum;
            res = Math.max(res,tsum);
        }
        return res;
    }
}

    public static void main(String[] args) {
        int[][] arr = [[1,2,3],[3,2,1]];
    }
}