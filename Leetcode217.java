package LeetcodePrac.LeetCode;

import java.util.Arrays;

public class Leetcode217 {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i = 0; 
        while(i < nums.length -1) {
            if(nums[i] == nums[i+1]) {
                return true;
            } else {
                i++;
            }
        } return false;
    }
}
