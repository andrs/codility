package com.orange.bank.transaction.application.code;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

// codility solution count countries
public class CountCountriesTest {

    @Before
    public void setup() {

        MockitoAnnotations.initMocks(this);

        //when(rH)).thenReturn(bu);
    }

    @Test
    public void solutionExamn1Test() {
        int[][] A = new int[][]{
                { 5, 4, 4 },
                { 4, 3, 4 },
                { 3, 2, 4 },
                { 2, 2, 2 },
                { 3, 3, 4 },
                { 1, 4, 4 },
                { 4, 1, 1 }
        };
        // codility count countries: must be 11 countries inside matrix
        Assert.assertEquals(11, CountCountries.solution(A));
    }

    @Test
    public void solutionExamn2Test() {
        int[][] A = new int[][]{
                { 5, 4, 4 }
        };

        // codility count countries: must be 2 countries inside matrix
        Assert.assertEquals(2, CountCountries.solution(A));
    }

    @Test
    public void solutionExamn3Test() {
        // find same number on rifgt-let-up-down directions
        int[][] A = new int[][]{
                { 5, 4, 4, 4 },
                { 4, 3, 4, 4 },
                { 3, 2, 4, 4 },
                { 2, 2, 2, 1 },
                { 3, 3, 4, 4 },
                { 1, 4, 4, 4 },
                { 4, 1, 1, 4 },
                { 4, 1, 1, 4 },
                { 2, 1, 1, 4 }
        };

        // codility count countries: must be 13 countries inside matrix
        Assert.assertEquals(13, CountCountries.solution(A));
    }

    @Test
    public void solutionExamn33Test() {
        // find same number on rifgt-let-up-down directions
        int[][] A = new int[][]{
                { 5, 4, 4, 4 },
                { 4, 3, 4, 4 },
                { 3, 2, 4, 4 },
                { 2, 2, 2, 1 },
                { 3, 3, 4, 4 },
                { 1, 4, 4, 4 },
                { 4, 1, 1, 4 },
                { 4, 1, 1, 4 },
                { 2, 1, 1, 4 },
                { 2, 1, 5, 4 }
        };

        // codility count countries: must be 14 countries inside matrix
        Assert.assertEquals(14, CountCountries.solution(A));
    }

    @Test
    public void solutionExamn4Test() {
        int[][] A = new int[][]{
                { 5, 5, 5, 5, 4, 5, 5, 5 }
        };

        // codility count countries: must be 3 countries inside matrix
        Assert.assertEquals(3, CountCountries.solution(A));
    }

    @Test
    public void solutionExamn5Test() {
        int[][] A = new int[][]{
                { 5, 5, 5, 5 },
                { 5, 2, 5, 5 },
                { 5, 2, 2, 5 }

                //
        };

        // codility count countries: must be 2 countries inside matrix
        Assert.assertEquals(2, CountCountries.solution(A));
    }

    @Test
    public void solutionExamn6Test() {
        int[][] A = new int[][]{
                { 3, 2, 4 },
                { 2, 2, 2 }
        };

        // codility count countries: must be 3 countries inside matrix
        Assert.assertEquals(3, CountCountries.solution(A));
    }

}
