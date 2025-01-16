package rent.exception;

public class IllegalTripDistanceException extends IllegalArgumentException {

    private static final String MSG = "잘못된 이동거리 입력";

    public IllegalTripDistanceException() {
        super(MSG);
    }
}
