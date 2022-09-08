package com.united.solution;

public class Solution {
    public String removeThirdConsecutiveCharacters(String s1) {
        if (s1.length() > 2) {
            StringBuilder sb = new StringBuilder();

            // Append the first character
            sb.append(s1.charAt(0));

            // Append the second character
            sb.append(s1.charAt(1));

            // Loop for i=2 to n
            for (int i = 2; i < s1.length(); i++) {

                // If consecutive three element
                // are not equal then append
                if (s1.charAt(i) != s1.charAt(i - 1) || s1.charAt(i) != s1.charAt(i - 2)) {
                    sb.append(s1.charAt(i));
                }
            }
            return sb.toString();
        }
        else{
            return s1;
        }
    }
}
