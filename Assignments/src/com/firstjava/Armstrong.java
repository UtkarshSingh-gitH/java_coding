package com.firstjava;

import java.util.Scanner;
import java.util.*;

public class Armstrong {
    static double digitCount(int num){
        double count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double count,sum=0,temp=0,test=0;
        System.out.println("Enter the number to be checked : ");
        int num = in.nextInt();
        test = num;
        count = digitCount(num);
        while(num>0){
            temp=num%10;
            sum = sum+(Math.pow(temp,count));
            num=num/10;
        }
        if(sum == test)
            System.out.println("Number is armstrong");
        else
            System.out.println("Number is not armstrong");

    }

}
