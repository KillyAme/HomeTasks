package homework6;

import static homework6.Matrix.matrixAddition;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new double[][]{{1, 2, 5, 5}, {4, 5, 8, 6}, {3, 5, 8, 9}});
        Matrix matrix2 = new Matrix(new double[][]{{8, 4, 6, 5}, {4, 5, 8, 6}, {7, 9, 4, 12}});
        matrixAddition(matrix1, matrix2);
        matrix2.print();
        matrix2.multiplyByNumber(2.5);
    }
}
