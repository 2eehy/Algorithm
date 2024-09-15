package chap03_Array;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] array2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        int[][] resultArray = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        // 결과 출력
        System.out.println("두 배열의 합:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
