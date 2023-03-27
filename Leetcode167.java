package LeetcodePrac.LeetCode;

public class Leetcode167 {
    public static int[] twoSum(int[] numbers, int target) {
        int a = 0; 
        int b = numbers.length-1; 
        
        while(a < b) {
            if(numbers[a] + numbers[b] < target) 
                a++;
            if(numbers[a] + numbers[b] > target)
                b--; 
            if(numbers[a] + numbers[b] == target) {
                int[] result = {a+1, b+1}; 
                System.out.printf("%d, %d\n",result[0], result[1]);
                return result;
            }
        }
        return null; 
    }
}
