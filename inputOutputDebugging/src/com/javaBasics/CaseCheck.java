package com.javaBasics;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char n = in.next().charAt(0);
        if(n>='A' && n<='Z')
            System.out.println("It is UpperCase");
        else if(n>='a' && n<='z')
            System.out.println("This is LoweCase");
    }
}
