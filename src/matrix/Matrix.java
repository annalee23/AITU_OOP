package matrix;

public class Matrix {
    private double[][] array;
    private int n;
    private int m;


    public Matrix() {
    }
    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.array = new double[n][m];
    }

    public int getN() {
        return n;
    }
    public int getM() {
        return m;
    }
    public double[][] getArray() {
        return array;
    }
    public void setN(int n) {
        this.n = n;
    }
    public void setM(int m) {
        this.m = m;
    }
    public void setArray(double[][] array) {
        this.array = array;
    }

    public Matrix addMatrix(Matrix other) {
        if (this.n != other.n || this.m != other.m) {
            System.out.println("Error! Matrix dimentions must be the same to addition");
        }
        Matrix result = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result.array[i][j] = this.array[i][j] + other.array[i][j];
            }
        }
        return result;
    }

    public Matrix multiplyByNumber (double k) {
        Matrix result = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result.array[i][j] = this.array[i][j] * k;
            }
        }
        return result;
    }
    public void printOutMatrix () {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(this.array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public Matrix multiplyTwoMatrix (Matrix other) {
        if (this.m != other.n) {
            System.out.println("Error! Number of columns in the first matrix must be equal to the number of rows in the second matrix");
        }
        Matrix result = new Matrix(this.n, other.m);

        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < other.m; j++) {
                for (int k = 0; k < this.m; k++) {
                    result.array[i][j] += this.array[i][k] * other.array[k][j];
                }
            }
        }
        return result;
    }
}
