package coord2.exception;

public class IllegalInputPatternException extends IllegalArgumentException {

    private static final String MESSAGE = "올바르지 않은 입력 양식";

    public IllegalInputPatternException() {
        super(MESSAGE);
    }
}
