package coord2.exception;

public class IllegalSquareException extends IllegalArgumentException {

    private static final String MESSAGE = "직사각형이 될 수 없음";

    public IllegalSquareException() {
        super(MESSAGE);
    }
}
