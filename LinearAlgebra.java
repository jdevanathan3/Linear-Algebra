/**
 * Class containing essential Linear Algebra operations.
 *
 * @author Jayanth Devanathan
 * @version 1.0
 */
public class LinearAlgebra {
    /**
    * Multiplies a vector v by a matrix m using linear algebra
    * conventions.
    * @param m, v
    * @return resultant vector
    */
    public static Vector matrixVectorMultiply(Matrix m, Vector v)
        throws IllegalOperandException {
        if (m.getWidth() != v.getLength()) {
            throw new IllegalOperandException("Width " + m.getWidth()
                  + " of matrix does not match length " + v.getLength()
                  + " of vector.");
        }
        double[] result = new double[m.getHeight()];
        for (int x = 0; x < m.getHeight(); x++) {
            int rowSum = 0;
            for (int y = 0; y < m.getWidth(); y++) {
                rowSum += m.get(x, y) * v.get(y);
            }
            result[x] = rowSum;
        }
        return new Vector(result);
    }
    /**
    * Adds matrices m1 and m2 by matrix addition conventions.
    * @param m1, m2
    * @return resultant sum matrix of m1 and m2
    */
    public static Matrix matrixAdd(Matrix m1, Matrix m2)
        throws IllegalOperandException {
        if (m1.getWidth() != m2.getWidth()) {
            throw new IllegalOperandException("Width " + m1.getWidth()
                  + " of matrix does not match width " + m2.getWidth()
                  + " of other matrix.");
        } else if (m1.getHeight() != m2.getHeight()) {
            throw new IllegalOperandException("Height " + m1.getHeight()
                  + " of matrix does not match height " + m2.getHeight()
                  + " of other matrix.");
        }
        double[][] result = new double[m1.getHeight()][m1.getWidth()];
        for (int x = 0; x < m1.getHeight(); x++) {
            for (int y = 0; y < m1.getWidth(); y++) {
                result[x][y] = m1.get(x, y) + m2.get(x, y);
            }
        }
        return new Matrix(result);
    }
    /**
    * Calculates the dot product of vectors v1 and v2.
    * @param v1, v2
    * @return resultant scalar of v1 dot v2
    */
    public static double dotProduct(Vector v1, Vector v2)
        throws IllegalOperandException {
        if (v1.getLength() != v2.getLength()) {
            throw new IllegalOperandException("Length " + v1.getLength()
                  + " of vector does not match length " + v2.getLength()
                  + " of other vector.");
        }
        double dotProduct = 0.0;
        for (int x = 0; x < v1.getLength(); x++) {
            dotProduct += v1.get(x) * v2.get(x);
        }
        return dotProduct;
    }
    /**
    * Adds vectors v1 and v2 by vector addition conventions.
    * @param v1, v2
    * @return resultant sum vector of v1 and v2
    */
    public static Vector vectorAdd(Vector v1, Vector v2)
        throws IllegalOperandException {
        if (v1.getLength() != v2.getLength()) {
            throw new IllegalOperandException("Length " + v1.getLength()
                  + " of vector does not match length " + v2.getLength()
                  + " of other vector.");
        }
        double[] result = new double[v1.getLength()];
        for (int x = 0; x < v1.getLength(); x++) {
            result[x] = v1.get(x) + v2.get(x);
        }
        return new Vector(result);
    }
}