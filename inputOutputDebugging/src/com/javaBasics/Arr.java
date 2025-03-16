package com.javaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        in.nextLine();
        String name = in.nextLine();
        System.out.println(name);
        System.out.println(Arrays.toString(arr));

        in.next();
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }

}
