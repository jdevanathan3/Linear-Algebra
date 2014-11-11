/**
 * Class for an Illegal Operand Exception found in linear algebra methods.
 *
 * @author Jayanth Devanathan
 * @version 1.0
 */
public class IllegalOperandException extends Exception {
    /**
    * Constructor. Calls default Exception constructor.
    */
    public IllegalOperandException() {
        super();
    }
    /**
    * Constructor. Takes in string message, and calls pertaining
    * Exception constructor.
    * @param message
    */
    public IllegalOperandException(String message) {
        super(message);
    }

}