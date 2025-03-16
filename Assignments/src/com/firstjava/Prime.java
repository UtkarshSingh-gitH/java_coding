package com.firstjava;

import java.util.Scanner;

public class Prime {
    static boolean isPrime(int num){
        boolean ans = false;
        Scanner in = new Scanner(System.in);
        for(int i=2; i*i<=num;i++){
            if(num%i==0) {
                ans = false;
                break;
            }
            else
                ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }
}
