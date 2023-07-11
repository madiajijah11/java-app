package shape.exception;

public class InputNotValidException extends RuntimeException {
  public InputNotValidException(String message) {
    super(message);
  }

  public InputNotValidException() {
    super("Input not valid! Please check!");
  }
}
