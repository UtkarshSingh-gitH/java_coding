package com.firstjava;
import java.util.*;

public class eLC1480 {
    static int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        ans[0] = nums[0];
        for(int i=1;i<(nums.length);i++){
            ans[i] = ans[i-1]+nums[i];
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int ans[] = new int[arr.length];
        ans = runningSum(arr);
        System.out.println(Arrays.toString(ans));

    }
}

/*
* Intuition
The problem requires calculating the running sum of an array, meaning each element at index i should store the sum of all previous elements up to that index. A straightforward way to achieve this is by iterating through the array and updating each element based on the sum of its previous elements.

Approach
1)Iterate through the array starting from index 1 (since index 0 remains unchanged).
2)For each index i, update nums[i] by adding the value of nums[i - 1].
3)Return the modified nums array as the result.

Complexity
Time complexity:O(n)
-We traverse the array once, performing constant-time operations at each step.
Space complexity:𝑂(1)
The solution modifies the input array in place, requiring no extra space apart from the input array.
*/
