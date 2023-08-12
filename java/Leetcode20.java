package LeetcodePrac.LeetCode;

import java.util.HashMap;
import java.util.LinkedList;

public class Leetcode20 {

    public static boolean isValid2(String s) {
        boolean result = false;
        char[] charArray = s.toCharArray(); 

        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
        hashMap.put('}', '{');
        hashMap.put(')', '(');
        hashMap.put(']', '[');
        LinkedList<Character> linkedList = new LinkedList<>();

        for(char c : charArray) {
            if(hashMap.containsKey(c)) { // checking for closing brakcets
                if(linkedList.size() != 0 && linkedList.get(linkedList.size()-1) == hashMap.get(c)) {
                    linkedList.remove(linkedList.size()-1); 
                } else {
                    return result; 
                }
            } else { //checking for open brackets
                linkedList.add(c);
            }
    }
        if (linkedList.isEmpty()) {
            result = true;
            return result;
        } else {
            return result;
        }
    }



    public static boolean isValid(String s) {

        boolean result = false;

        HashMap<Character, Character> hashMap = new HashMap<Character, Character>();
        hashMap.put('}', '{');
        hashMap.put(')', '(');
        hashMap.put(']', '[');

        LinkedList<Character> linkedList = new LinkedList<>();

        // error handling
        if (s.length() % 2 != 0) {
            return result;

        } else if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') {
            return result;

        } else {
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                    linkedList.add(s.charAt(i));

                if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
                    System.out.println(linkedList.size());
                    if (linkedList.size() == 0) {
                        return result; 
                    }
                    if (hashMap.get(s.charAt(i)) == linkedList.get(linkedList.size()-1)) {
                        linkedList.remove(linkedList.size() - 1);

                    } else {
                        return result;
                    }
                }
            }
            if (linkedList.isEmpty()) {
                result = true;
            }
            return result;
        }
    }
}
