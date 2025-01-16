package rent.service;

import rent.domain.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RentServiceImpl implements RentService {

    @Override
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

    @Override
    public String generateReport(List<Car> carArray) {
        return "";
    }
}