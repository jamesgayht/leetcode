package LeetcodePrac.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class LeetCode128 {
    public static int longestConsecutive(int[] nums) { 
        if(nums.length < 1) {
            return 0; 
        } 

        HashSet<Integer> hashSet = new HashSet<>(); 
        
        int counter = 0; 
        int consecutive = 0; 

        for(int i=0; i<nums.length; i++) {
            System.out.printf("nums[i] = %d\n", nums[i]);
            hashSet.add(nums[i]); 
        }

        Integer[] newNums = new Integer[hashSet.size()]; 
        hashSet.toArray(newNums);
        Arrays.sort(newNums);

        for(int i = 0; i< newNums.length; i++) {
            if(hashSet.contains(newNums[i] + 1)) {
                System.out.printf("newNums[i] = %d\n", newNums[i]);
                counter ++; 
                System.out.printf("counter = %d\n", counter);
                if(consecutive < counter) {
                    consecutive = counter; 
                }
            } else {
                counter = 0; 
            }
        }
        return consecutive+1; 
    }
}