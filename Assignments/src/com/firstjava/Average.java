package com.firstjava;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total amount of number :");
        int num = in.nextInt();
        int sum=0;
        System.out.println("Enter each number");
        for(int i = 0;i<num;i++){
            sum+=in.nextInt();
            /*int n = in.nextInt()
            * sum = sum+n*/
        }
        sum = sum/num;
        System.out.println("The average is "+sum);
    }
}
