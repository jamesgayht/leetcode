package LeetcodePrac.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode49 {
    // group anagrams
    public static List<List<String>> groupAnagrams (String[] strs) {

        HashMap<String, List<String>> hashMap = new HashMap<>();
        char[] chars;
        String key; 
        
        for(int i=0; i<strs.length; i++) {
            System.out.println("strs[i] = " + strs[i]);
            chars = strs[i].toCharArray();
            Arrays.sort(chars);
            key = Arrays.toString(chars); 
            System.out.println("key = " + key);

            if(!hashMap.containsKey(key)) {
                hashMap.put(key, new ArrayList<String>()); 
            }
            hashMap.get(key).add(strs[i]); 

        }

        List<List<String>> anagrams = new ArrayList<>(hashMap.values()); 

        return anagrams;
    
    }
}
