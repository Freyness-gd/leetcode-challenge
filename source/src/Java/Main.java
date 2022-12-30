package Java;


import Java.challenges.*;

import java.util.Arrays;

public class Main {

//    To run any challenge:
//    1. ChallengeClass.function(input)
//    2. Print the challenge

    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;

        System.out.println(Arrays.toString(kWeakestRowsInAMatrix.kWeakestRows(mat, k)));

    }
}

