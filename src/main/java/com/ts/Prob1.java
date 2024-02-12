package com.ts;

/**
 * <a href="https://leetcode.com/problems/two-sum">Two sum</a>
 */
public class Prob1 {

  public static void main(String[] args) {
    twoSum(new int[]{2, 7, 11, 15}, 9);
  }

  public static int[] twoSum(int[] nums, int target) {
    int length = nums.length;
    for (int j = 0; j < length; j++) {
      for (int i = 1; i < length; i++) {
        if ((i != j) && target == (nums[j] + nums[i])) {
          return new int[]{j, i};
        }
      }
    }
    return new int[]{};
  }
}
