package LeetcodePrac.LeetCode;

public class Leetcode14 {

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        if(strs.length < 1) {
            return "";
        }

        for(int i=1; i<strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1); 
                System.out.println(prefix);
            }
        }
        return prefix;
    }
}
