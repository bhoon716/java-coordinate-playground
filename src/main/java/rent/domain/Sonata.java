package rent.domain;

public class Sonata extends Car{
    public Sonata(int tripDistance) {

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
