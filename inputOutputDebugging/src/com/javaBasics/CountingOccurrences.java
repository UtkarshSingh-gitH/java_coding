package com.javaBasics;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1385757879;
        int count = 0;
        while (num > 0) {
            int temp = num % 10;
            if (temp==7)
                count++;
            num = num/10;
        }
        System.out.println(count);
    }
}
