package com.firstjava;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the 2 numbers : ");
    int num1 = in.nextInt();
    int num2 = in.nextInt();
    //int ans=0;
    while (num2 != 0) {  // Repeat until remainder becomes 0
            int temp = num2;
            num2 = num1 % num2;  // Get remainder
            num1 = temp;
    }
    System.out.println("The HCF is = "+num1);
    }
}
