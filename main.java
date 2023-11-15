import java.util.Arrays;

public class Matrix {
private int[][] matrix;
private int rows;
private int columns;

public Matrix(int[][] matrix) {
    this.matrix = matrix;
    rows = matrix.length;
    columns = matrix[0].length;
}

// Метод печати матрицы
public void printMatrix() {
    System.out.println("Matrix:");
    for (int[] row : matrix) {
        System.out.print("   " + Arrays.toString(row));
    }
    System.out.println();
}

// Сложение матриц
public Matrix addMatrix(Matrix other) {
    if (rows == other.getRows() && columns == other.getColumn()) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix[i][j] + other.

