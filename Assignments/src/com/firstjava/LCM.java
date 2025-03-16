package com.firstjava;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans= (num1>num2)?num1:num2;
        while(true) {
            if (ans % num1 == 0 && ans % num2 == 0)
                break;
            ans++;
        }
    }
}
