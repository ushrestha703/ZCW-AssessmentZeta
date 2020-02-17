package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {

        int N = input.length();

        // create a 2D array to store the count
        // of palindromic subsequence
        int[][] cps = new int[N+1][N+1];

        // palindromic subsequence of length 1
        for (int i = 0; i < N; i++)
            cps[i][i] = 1;

        // check subsequence of length L is
        // palindrome or not
        for (int L=2; L<=N; L++)
        {
            for (int i = 0; i < N; i++)
            {
                int k = L + i - 1;
                if (k < N){
                    if (input.charAt(i) == input.charAt(k))
                        cps[i][k] = cps[i][k-1] +
                                cps[i+1][k] + 1;
                    else
                        cps[i][k] = cps[i][k-1] +
                                cps[i+1][k] -
                                cps[i+1][k-1];
                }
            }
        }

        // return total palindromic subsequence
        return cps[0][N-1];

    }
}

