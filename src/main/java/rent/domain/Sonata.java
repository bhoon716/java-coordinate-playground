package rent.domain;

public class Sonata extends Car{

    public Sonata(double tripDistance) {
        super(tripDistance);
    }

    @Override
    public double getDistancePerLiter() {
        return 10.0;
    }

    @Override
    public String getName() {
        return "Sonata";
    }
}
