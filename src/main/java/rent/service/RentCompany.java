package rent.service;

import rent.domain.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RentCompany {

//    private final List<Car> cars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

//    public boolean addCar(Car car) {
//        cars.add(car);
//        return true;
//    }

    public List<Car> mapStringToCar(String cars) {
        String[] carNameAndDist = cars.split(",");
        return Arrays.stream(carNameAndDist).map(c -> {
            String[] nameAndDist = c.split(":");
            String name = nameAndDist[0];
            int distance = Integer.parseInt(nameAndDist[1]);
            Car car = RentCarFactory.createCar(name, distance);
            return car;
        }).collect(Collectors.toList());
    }

    public String generateReport(List<Car> carList) {
        return carList.stream().map(car -> car.getName() + " : " + (int)car.getChargeQuantity()+"리터\n").collect(Collectors.joining());
    }
}
