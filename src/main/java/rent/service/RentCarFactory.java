package rent.service;

import rent.domain.Avante;
import rent.domain.Car;
import rent.domain.K5;
import rent.domain.Sonata;
import rent.exception.IllegalCarTypeException;

public class RentCarFactory {
    public static Car createCar(String carType, int dist) {
        switch (carType) {
            case "Avante":
                return new Avante(dist);
            case "K5":
                return new K5(dist);
            case "Sonata":
                return new Sonata(dist);
            default:
                throw new IllegalCarTypeException();
        }
    }
}
