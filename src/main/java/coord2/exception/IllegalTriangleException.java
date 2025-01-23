package coord2.exception;

public class IllegalTriangleException extends IllegalArgumentException {

    private static final String MESSAGE = "삼각형이 될 수 없음";

    public IllegalTriangleException() {
        super(MESSAGE);
    }
}
