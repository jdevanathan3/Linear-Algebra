/**
 * Immutable abstraction for Vector
 *
 * @author Jayanth Devanathan
 * @version 1.3
 */
public class Vector {

    /*
    Create final instance variables
    */
    private final double[] vector;
    private final int length;
    /**
     * Initialize instance variables
     * @param vector array representation of vector
     */
    public Vector(double[] vector) {
        this.vector = vector;
        length = vector.length;
    }

    /**
     * Gets value located at specified index
     * @param i index in vector
     * @return double located at index 'i' in vector
     */
    public double get(int i) {
        if (i >= length) {
            throw new VectorIndexOutOfBoundsException("Index " + i
                         + " is greater than vector length " + length);
        }
        return vector[i];
    }

    /**
     * Get's the length of the Vector.
     * @return number of components in vector
     */
    public int getLength() {
        return length;
    }

    /**
     * String representation of vector with components
     * separated by tabs
     * @return String representation of vector
     */
    public String toString() {
        String s = "";
        for (int x = 0; x < length; x++) {
            s += vector[x] + "\t";
        }
        return s;
    }
}