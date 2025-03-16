package com.firstjava;

import java.util.Arrays;
import java.util.Scanner;

public class eLC1920 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an array of size 6");
        int[] nums = new int[6];
        for(int i=0;i<6;i++){
            nums[i] = in.nextInt();
        }
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}

/*
Intuition
The problem requires us to build a new array based on indices mapping (nums[nums[i]]).
Since nums is a valid permutation of [0, n-1], we can directly access indices without out-of-bounds errors.
Approach
We iterate through nums and construct a new array ans, where:

res[i]=nums[nums[i]]

Complexity
Time complexity: O(N)
Space complexity: O(N)
*/