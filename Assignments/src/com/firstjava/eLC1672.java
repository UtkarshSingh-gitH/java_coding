package com.firstjava;

import java.util.Arrays;
import java.util.Scanner;

public class eLC1672 {
    static int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            res = Math.max(res, temp);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Enter m and n");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        int[][] accounts = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                accounts[i][j] = in.nextInt();
            }
        }
        System.out.println((maximumWealth(accounts)));
    }
}
