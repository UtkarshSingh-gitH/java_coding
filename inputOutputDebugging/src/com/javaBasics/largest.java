package com.javaBasics;

import java.util.Scanner;

public class largest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max = num1;
        if(max<num2)
            max=num2;
        else if(max<num3)
            max=num3;
        System.out.println("The largest number is = "+max);
    }
}
