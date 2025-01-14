package rent.domain;

public class K5 extends Car{

    public K5(int tripDistance) {
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
