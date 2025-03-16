package com.firstjava;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String :");
        String name = in.next();
        String temp="";
        for(int i=(name.length()-1); i>=0; i--)
        {
            temp += name.charAt(i);
        }
        System.out.println(temp);
    }
}
