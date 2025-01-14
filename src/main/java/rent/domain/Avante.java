package rent.domain;

public class Avante extends Car{

    public Avante(double tripDistance) {
        super(tripDistance);
    }

    @Override
    public double getDistancePerLiter() {
        return 15.0;
    }

    @Override
    public String getName() {
        return "Avante";
    }
}
