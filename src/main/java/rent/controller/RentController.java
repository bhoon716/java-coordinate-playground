package rent.controller;

import rent.domain.Car;
import rent.service.RentService;
import rent.view.InputView;
import rent.view.OutputView;

import java.util.List;

public class RentController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RentService rentService;

    public RentController(InputView inputView, OutputView outputView, RentService rentService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.rentService = rentService;
    }

    public void run(){
        outputView.printEnterRentCar();
        String cars = inputView.readRentCar();
        List<Car> array = rentService.mapStringToCar(cars);
        String report = rentService.generateReport(array);
        outputView.printReport(report);
    }
}
