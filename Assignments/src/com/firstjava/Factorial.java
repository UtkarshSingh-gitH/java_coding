package com.firstjava;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = in.nextInt();
        int ans=1;
        for(int i=2;i<=num;i++)
        {

            ans = (i*ans);
        }
        System.out.println("The ans is : "+ans);
    }
}
