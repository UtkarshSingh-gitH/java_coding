package com.firstjava;

import java.util.Scanner;

public class Palindrome {

    static boolean check(String word){
        String temp = "";
        for(int i=word.length()-1; i>=0;i--)
        {
            temp = temp + word.charAt(i);
        }
        boolean ans = temp.equals(word); //In Java, == checks whether temp and word refer to the same object in memory, not whether they contain the same text.
        return ans;

    }

    public static void main(String[] args){
        String word;
        System.out.println("Enter a word : ");
        Scanner in = new Scanner(System.in);
        word = in.next();
        System.out.println(check(word));

    }
}
