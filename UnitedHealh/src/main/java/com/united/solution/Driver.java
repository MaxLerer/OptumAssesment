package com.united.solution;

public class Driver {
    public static void main (String [] args){
        Solution trialSolution = new Solution();
        String testString = "ccccddeeeff";
        String result = trialSolution.removeThirdConsecutiveCharacters(testString);
        System.out.println(result);
    }
}
