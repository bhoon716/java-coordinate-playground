package coord2.exception;

public class IllegalLineException extends IllegalArgumentException {

    private static final String MESSAGE = "직선이 될 수 없음";

    public IllegalLineException() {
        super(MESSAGE);
    }
}
