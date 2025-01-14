package rent.domain;

public class K5 extends Car{

    public K5(double tripDistance) {
        super(tripDistance);
    }

    @Override
    public double getDistancePerLiter() {
        return 13.0;
    }

    @Override
    public String getName() {
        return "K5";
    }
}
