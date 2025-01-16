package rent.controller;

import rent.domain.Car;
import rent.service.RentCompany;
import rent.view.InputView;
import rent.view.OutputView;

import java.util.List;

public class RentController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RentCompany rentCompany;

    public RentController(InputView inputView, OutputView outputView, RentCompany rentCompany) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.rentCompany = rentCompany;
    }

    public void run() {
        outputView.printEnterRentCar();
        String cars = inputView.readRentCar();
        List<Car> array = rentCompany.mapStringToCar(cars);
        String report = rentCompany.generateReport(array);
        outputView.printReport(report);
    }
}
