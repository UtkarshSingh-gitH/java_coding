package com.firstjava;

import java.util.Scanner;

public class eLC1281 {
    public static void main(String[] args) {
        int sum=0,prod=1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n>0){
            int temp = n%10;
            sum += temp;
            prod *= temp;
            n=n/10;
        }
        System.out.println(prod-sum);
    }
}

/*Intuition
We are tasked with calculating the difference between the product and the sum of the digits of a number n. The core idea is to extract the digits of the number, compute their sum and product simultaneously, and then subtract the sum from the product.

Approach
Initialize two variables: sum to 0 (to store the sum of digits) and product to 1 (to store the product of digits).
Use a loop to iterate through each digit of the number:
Extract the last digit of n by taking n % 10.
Add this digit to sum.
Multiply this digit to product.
Remove the last digit of n by performing integer division n //= 10.
After processing all digits, return the difference between product and sum.
Complexity
Time Complexity:
O(d), where d is the number of digits in the number n. The loop runs once for each digit.
Space Complexity:
O(1), since we are using a constant amount of space for the sum and product.
*/