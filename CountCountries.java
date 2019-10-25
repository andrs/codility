package com.orange.bank.transaction.application.code;

import lombok.extern.slf4j.Slf4j;

// codility find countries
@Slf4j
public class CountCountries {
    // movements
    private static final int[] row = { -1, -1, 0 };
    private static final int[] col = { -1, 0, -1 };

    private static boolean isSafeMove(int x, int y) {
        return (x >= 0) && (y >= 0);
    }

    private static int[] findNeighbors(int[][] A, int x, int y) {
        int[] neighbors = new int [3];
        for (int k = 0; k < 3; k++) {
            neighbors[k] = -1;
        }

        for (int k = 0; k < 3; k++) {
            if (isSafeMove(x + row[k], y + col[k])) {
                neighbors[k] = A[x + row[k]][y + col[k]];
            }
        }

        return neighbors;
    }

    public static int solution(int[][] A) {
        int M = A.length;
        int N = A[0].length;

        int countries = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {

                int[] neighbors = findNeighbors(A, i, j);
                int currentValue = A[i][j];

                if (neighbors[1] == currentValue
                        && neighbors[2] == currentValue
                        && neighbors[0] != currentValue ) {
                    countries--;
                }

                if (neighbors[1] != currentValue
                        && neighbors[2] != currentValue) {
                    countries++;
                }
            }
        }

        System.out.print("Number of countries are " + countries);

        return countries;
    }
}
