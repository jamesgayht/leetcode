package LeetcodePrac.LeetCode;

import java.util.ArrayList;

public class LeetCode125 {
    
    public static boolean isPalindrome(String s) {

        
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if(s.length() < 2) {
            return true;
        }

        ArrayList<Character> arrayList = new ArrayList<>(); 
        for(int i=0; i<s.length(); i++) {
            arrayList.add(s.charAt(i));
        }

        for(int i=0; i<arrayList.size()-1; i++) {
            for(int j=arrayList.size()-1; j>0; j--) {
                    if(arrayList.size() == 1) {
                        return true;
                    } else if(arrayList.get(i) != arrayList.get(j)) {
                        System.out.println(arrayList.get(i));
                        System.out.println(i);
                        System.out.println(arrayList.get(j));
                        System.out.println(j);

                        System.out.println("in here");
                        return false; 
                    } else {
                        arrayList.remove(j);
                        arrayList.remove(i); 
                        j--;
                    }
                }
            }

        return true; 
    }
}
