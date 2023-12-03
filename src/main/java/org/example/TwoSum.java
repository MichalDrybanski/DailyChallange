package org.example;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] tab = {2,4,5,5,3};
        int arr[] = twoSum(tab,10);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
