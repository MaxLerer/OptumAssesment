package com.united.solution;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTests {
    @Test
    public void stringLengthLessThanThreeReturnsOriginalString() {
        Solution lessThanThreeCharactersSolution = new Solution();

        assertEquals("rr", lessThanThreeCharactersSolution.removeThirdConsecutiveCharacters("rr"));
        assertEquals("re", lessThanThreeCharactersSolution.removeThirdConsecutiveCharacters("re"));

    }

    @Test
    public void stringLengthGreaterThanTwoRemovesThirdConsecutives() {
        Solution greaterThanTwoCharSolution = new Solution();

        assertEquals("rr", greaterThanTwoCharSolution.removeThirdConsecutiveCharacters("rrr"));
        assertEquals("rraabb", greaterThanTwoCharSolution.removeThirdConsecutiveCharacters("rrraabbbb"));
        assertEquals("rraabbrre", greaterThanTwoCharSolution.removeThirdConsecutiveCharacters("rrraabbbbrre"));
    }
}

