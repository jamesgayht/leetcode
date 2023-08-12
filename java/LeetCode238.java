package LeetcodePrac.LeetCode;

public class LeetCode238 {
    public static int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length < 2) {
            return null;
        }

        int[] result = new int[nums.length]; 
        int counter = 1;
        
        for(int i = 0; i<nums.length; i++) {
            result[i] = counter; 
            counter *= nums[i];
        }

        // reset counter to 1;
        counter = 1;
        
        for(int i=nums.length-1; i>=0; i--) {
            result[i] = result[i] * counter; 
            counter *= nums[i]; 
            System.out.println(i);
            System.out.println(result[i]);
        }
        
        return result; 
    }
}
