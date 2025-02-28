package com.javaBasics;

import java.util.Scanner;

public class Swap {


    static void swap(int a){
        System.out.println("Enter another number");
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        System.out.println("a = "+a+" b = "+b);
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println("After Swap a = "+a + " b = "+b);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = in.nextInt();
        swap(a);

        String name = "Utkarsh Singh";
        changename(name);
        System.out.println("Another name for same is : "+name);
    }

    static void changename(String name) {
        name = "Gargii Singh";
        System.out.println("One name is : "+name);
    }
}
