/**
 * Class for a Vector Index Out of Bounds Exception
 * found in linear algebra methods.
 *
 * @author Jayanth Devanathan
 * @version 1.0
 */
public class VectorIndexOutOfBoundsException extends
             IndexOutOfBoundsException {
    /**
    * Constructor. Calls default IndexOutOfBoundsException constructor.
    */
    public VectorIndexOutOfBoundsException() {
        super();
    }
    /**
    * Constructor. Takes in string message, and calls pertaining
    * IndexOutOfBoundsException constructor.
    * @param message
    */
    public VectorIndexOutOfBoundsException(String message) {
        super(message);
    }
}