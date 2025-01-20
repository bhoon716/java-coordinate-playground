package coord2.exception;

public class IllegalPointException extends IllegalArgumentException {

    private static final String MESSAGE = "올바르지 않은 좌표";

    public IllegalPointException() {
        super(MESSAGE);
    }
}