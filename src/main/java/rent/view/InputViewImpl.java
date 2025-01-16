package rent.view;

import java.util.Scanner;

public class InputViewImpl implements InputView {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public String readRentCar() {
        return sc.nextLine();
    }
}
