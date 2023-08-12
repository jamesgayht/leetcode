package LeetcodePrac.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leetcode347 {
    
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> numsFrequency = new HashMap<>(); 
        
        for(int i=0; i<nums.length; i++) {
            if(numsFrequency.get(nums[i]) == null) {
                numsFrequency.put(nums[i], 1);
            } else {
                numsFrequency.put(nums[i], numsFrequency.get(nums[i]) + 1); 
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((a, b) -> {
            return b.getValue() - a.getValue(); 
        });

        for(Map.Entry<Integer, Integer> entry : numsFrequency.entrySet()) {
            priorityQueue.add(entry);
        }

        int[] result = new int[k]; 

        for (int i=0; i<k; i++) {
            result[i] = priorityQueue.poll().getKey(); 
            System.out.println(result[i]);
        }


        return result; 
    }

    
}
