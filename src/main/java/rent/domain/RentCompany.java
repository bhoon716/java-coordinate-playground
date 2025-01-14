package rent.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {

    private final List<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public boolean addCar(Car car) {
        cars.add(car);
        return true;
    }

    public String generateReport() {
        return cars.stream().map(car -> car.getName() + " : " + (int)car.getChargeQuantity()+"리터\n").collect(Collectors.joining());
    }
}
