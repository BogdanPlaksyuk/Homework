package Homework9Plaksyuk;

import java.util.Random;

public class Transposition {
    public static void main(String[] args) {
        System.out.println("Original Matrix:");
        int[][] matrixOne = matrixCreate(10, 20, 4, 5);
        System.out.println();
        System.out.println("Matrix Transpositioned:");
        matrixTransp(matrixOne);
    }

    public static int[][] matrixCreate(int min, int max, int m, int n) {
        Random random = new Random();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(max - min + 1) + min;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static void matrixTransp(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int value = matrix[j][i];
                newMatrix[j][i] = value;
                System.out.print(newMatrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
