package rent.exception;

public class IllegalCarTypeException extends IllegalArgumentException {

    private static final String MSG = "지원하지 않는 차량 종류";

    public IllegalCarTypeException() {
        super(MSG);
    }
}
