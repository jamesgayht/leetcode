package LeetcodePrac.LeetCode;

import java.util.Arrays;

public class Leetcode242 {

    public static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray(); 
        char[] tArray = t.toCharArray(); 
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        if(sArray.length == tArray.length) {
            for(int i=0; i<sArray.length; i++) {
                System.out.println(i);
                System.out.printf("sArray[i] = %c\n",sArray[i]);
                System.out.printf("tArray[i] = %c\n",tArray[i]);
                if(sArray[i] != tArray[i]) {
                    return false; 
                }
            } return true; 
        } else {
            return false; 
        }
    }
}
