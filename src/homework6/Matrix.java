package homework6;

import java.util.Arrays;
import java.util.Objects;

public class Matrix {
    private double[][] array;
    private int x, y;

    public Matrix(double[][] array) {
        this.array = array;
        for (int i = 0; i < array.length - 1; i++)
            if (array[i].length == array[i + 1].length) {
                this.x = array.length;
                this.y = array[0].length;
            } else {
                System.out.println("Матрица введена неверно");
            }
    }


    public double[][] getArray() {
        return array;
    }

    public void setArray(double[][] array) {
        this.array = array;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Matrix)) return false;
        Matrix matrix = (Matrix) o;
        return x == matrix.x &&
                y == matrix.y &&
                Arrays.equals(array, matrix.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(x, y);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "array=" + Arrays.deepToString(array) +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public static void matrixAddition(Matrix matrix1, Matrix matrix2) {
        double[][] matrixSumm = new double[matrix1.getX()][matrix1.getY()];
        if (matrix1.getX() == matrix2.getX() && matrix1.getY() == matrix2.getY()) {
            for (int i = 0; i < matrix1.getX(); i++) {
                for (int j = 0; j < matrix1.getY(); j++) {
                    matrixSumm[i][j] = matrix1.getArray()[i][j] + matrix2.getArray()[i][j];
                }
            }
            System.out.println("Матрица " + Arrays.deepToString(matrix1.getArray()) + "\n прибавить \n матрицу "
                    + Arrays.deepToString(matrix2.getArray()) + "\n равна" + Arrays.deepToString(matrixSumm));
        } else {
            System.out.println("Невозможно сложить матрицы разных размерностей");
        }
    }

    public void print() {
        System.out.println("Матрица" + Arrays.deepToString(array) +
                ", количество строк равно " + x +
                ", количество столбцов равно " + y);
    }

    public void multiplyByNumber(double number) {
        double[][] multiplyMatrix = new double[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                multiplyMatrix[i][j] = array[i][j] * number;
            }
        }
        System.out.println("Матрица " + Arrays.deepToString(array) + " умноженная на " + number + " равна " + Arrays.deepToString(multiplyMatrix));
    }
}
