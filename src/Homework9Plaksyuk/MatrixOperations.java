package Homework9Plaksyuk;

import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        System.out.println("Матрица С:");
        int[][] matrixC = matrixCreate(0, 99, 3, 3);
        System.out.println();
        System.out.println("Матрица D:");
        int[][] matrixD = matrixCreate(0, 99, 3, 3);
        System.out.println();
        System.out.println("Результат сложения матриц:");
        matrixPlus(matrixC, matrixD);
        System.out.println();
        System.out.println("Результат умножения матриц:");
        matrixPlural(matrixC, matrixD);
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
    public static void matrixPlus(int[][] matrix1, int[][]matrix2) {
        int[][] matrixResult = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixResult[i][j] = matrix1[i][j]+matrix2[i][j];
                System.out.print(matrixResult[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void matrixPlural(int[][] matrix1, int[][]matrix2) {
        int[][] matrixResult = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixResult[i][j] = matrix1[i][j]*matrix2[i][j];
                System.out.print(matrixResult[i][j] + " ");
            }
            System.out.println();
        }
    }
}
