package matrix;

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.setArray(new double[][]{{1, 2, 3}, {4, 5, 6}});

        Matrix matrix2 = new Matrix(2, 3);
        matrix2.setArray(new double[][]{{7, 8, 9}, {10, 11, 12}});

        System.out.println("\nAddition:");
        Matrix resAdd = matrix1.addMatrix(matrix2);
        resAdd.printOutMatrix();

        System.out.println("\nScalar Multiplication:");
        Matrix resScalarMult = matrix1.multiplyByNumber(2.5);
        resScalarMult.printOutMatrix();

        Matrix matrix3 = new Matrix(3, 2);
        matrix3.setArray(new double[][]{{1, 2}, {3, 4}, {5, 6}});

        System.out.println("\nTwo Matrix Multiplication:");
        Matrix resMult = matrix1.multiplyTwoMatrix(matrix3);
        resMult.printOutMatrix();
    }
}
