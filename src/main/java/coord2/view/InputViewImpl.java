package coord2.view;

import java.util.Scanner;

import static coord2.view.InputValidator.validateInput;

public class InputViewImpl implements InputView {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public String readPoints() {
        String input = sc.nextLine();
        validateInput(input);
        return input;
    }
}
