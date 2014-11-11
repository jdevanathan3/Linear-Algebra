/**
 * Class for a Matrix Index Out of Bounds Exception
 * found in linear algebra methods.
 *
 * @author Jayanth Devanathan
 * @version 1.0
 */
public class MatrixIndexOutOfBoundsException extends
             IndexOutOfBoundsException {
    /**
    * Constructor. Calls default IndexOutOfBoundsException constructor.
    */
    public MatrixIndexOutOfBoundsException() {
        super();
    }
    /**
    * Constructor. Takes in string message, and calls pertaining
    * IndexOutOfBoundsException constructor.
    * @param message
    */
    public MatrixIndexOutOfBoundsException(String message) {
        super(message);
    }

}