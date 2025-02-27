package com.javaBasics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int val = 10;
        int output = 0;
        while(num>0){
            int temp = num%10;
            output = temp + (output*val);
            num = num/10;
        }
        System.out.println(output);
    }
}
