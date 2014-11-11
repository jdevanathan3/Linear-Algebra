import java.util.InputMismatchException;
/**
 * Immutable abstraction of Matrix.
 *
 * @author Jayanth Devanathan
 * @version 1.3
 */
public final class Matrix {

    /*
    Create final instance variables
    */
    private final double[][] matrix;
    private final int height;
    private final int width;

    /**
     * Initialize instance variables
     * @param matrix 2D array representation of Matrix
     */
    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        height = matrix.length;
        if (height != 0) {
            width = matrix[0].length;
        } else {
            throw new InputMismatchException("Matrix cannot have"
                  + " height of 0.");
        }
    }

    /**
     * Gets value located at specified row and column
     * @param i row
     * @param j column
     * @return double located at row i and column j in matrix
     */
    public double get(int i, int j) {
        if (!(i < height && j < width)) {
            throw new MatrixIndexOutOfBoundsException("Index (" + i
                    + "," + j + ")" + " is outside matrix bounds of ("
                    + height + ", " + width + ").");
            //System.out.println("Found: MatrixIndexOutOfBoundsException");
        }
        return matrix[i][j];
    }

    /**
     * Get's the height of the matrix.
     * @return number of rows in matrix
     */
    public int getHeight() {
        return height;
    }

    /**
     * Get's the width of the matrix.
     * @return number of columns in matrix
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets String representation of matrix.
     * Columns separated by tabs, rows by new lines.
     * @return String representation of matrix.
     */
    public String toString() {
        String s = "";
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                s += matrix[x][y] + "\t";
            }
            s += "\n";
        }
        return s;
    }
}