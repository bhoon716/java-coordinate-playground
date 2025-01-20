package coord2.view;

import coord2.exception.IllegalInputPatternException;

import java.util.regex.Pattern;

public class InputValidator {

    private static final String COORDINATE_REGEX = "^\\(\\d+,\\d+\\)-\\(\\d+,\\d+\\)$";
    private static final Pattern PATTERN = Pattern.compile(COORDINATE_REGEX);

    public static void validateInput(String input) {
        if (input == null || input.isEmpty() || !PATTERN.matcher(input).matches()) {
            throw new IllegalInputPatternException();
        }
    }
}
