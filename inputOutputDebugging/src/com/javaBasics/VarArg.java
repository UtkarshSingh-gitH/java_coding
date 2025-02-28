package com.javaBasics;

import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,0);
    }
    static void fun(int ...num){
        System.out.println(Arrays.toString(num));
    }
}
