package LeetcodePrac.LeetCode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode9 {
    
    public static boolean isPalindrome(int x) {

        List<Integer> numList = new LinkedList<>(); 
        String numStr; 
        String xStr = Integer.toString(x); 

        if(x <= Math.pow(-2, 31) || x >= (Math.pow(2, 31) - 1)) {
            return false; 

        } else if(x < 0) {
            return false; 
            
        } else if (x == 0) {
            return true;

        } else {
            while(x > 0) {
                numList.add(x%10); 
                x /= 10; 
            }

            StringBuilder stringBuilder = new StringBuilder(); 
            int i = 0; 
            while (i<numList.size()) {
                stringBuilder.append(numList.get(i)); 
                i++; 
                System.out.println(stringBuilder.toString());
            }

            numStr = stringBuilder.toString(); 
            System.out.println("numStr > " + numStr);
             
            System.out.println("xStr > " + xStr);

            if(numStr.equals(xStr)) {
                return true; 
            }
        }
        return false; 
    }
}
