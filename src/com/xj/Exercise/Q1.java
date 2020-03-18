package com.xj.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Q1 {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        int[] result1 = q1.twoSum1(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result1[0]);
        System.out.println(result1[1]);

    }

    /**
     * 暴力法（时间复杂度O(n^2)，空间复杂度O(1)）
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum1(int[] nums, int target) {
        for(int i = 0; i < nums.length; i ++){
            for(int j = 0; j < nums.length; j ++){
                if(i == j){
                    continue;
                }
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(Integer[] nums, int target) {

        return null;
    }
}
