package rent.domain;

public class Avante extends Car{

    public Avante(int tripDistance) {
        super();
    }

    @Override
    double getDistancePerLiter() {
        return 0;
    }

    @Override
    double getTripDistance() {
        return 0;
    }

    @Override
    String getName() {
        return "";
    }
}
