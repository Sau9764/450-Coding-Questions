// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and uses only constant extra space.
// Constraints:

// 1 <= n <= 105
// nums.length == n + 1
// 1 <= nums[i] <= n
// All the integers in nums appear only once except for precisely one integer which appears two or more times.

import java.io.*;
import java.util.*;

class q11 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));

        System.out.println(findDupNum(a));


    }

    public static int findDupNum(int nums[]){
        
        int tor = nums[0];
        int hear = nums[0];

        do{
            tor = nums[tor];
            hear = nums[nums[hear]];
        }while(tor != hear);

        tor = nums[0];

        while(tor != hear){
            tor = nums[tor];
            hear = nums[hear];
        }

        return hear;
    }
}

// questions
// How can we prove that at least one duplicate number must exist in nums
// Ans. Checking n-1 element are present or not

// Can you solve the problem in linear runtime complexity
// Ans. Floyd's Tortoise and Hare cycle detection O(n) time and O(1) space.
