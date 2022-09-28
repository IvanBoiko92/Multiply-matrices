package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] A = matrix1;
        int[][] B = matrix2;
        int r = A.length;
        int c = B[0].length;
        int [][] C = new int[r][c];
        int o = B.length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < o; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        int[][] a = {
                {0, 12345},
                {4509, 0},
                {3, 567} };
        int[][] b = {
                {653, 0, 25353},
                {0, 61, 6} };
        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
