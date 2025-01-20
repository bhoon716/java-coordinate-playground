package coord2.view;

import java.util.Scanner;

public class InputViewImpl implements InputView {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public String readPoints() {
        String input = sc.nextLine();
        return input;
    }
}
