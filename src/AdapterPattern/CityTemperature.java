package AdapterPattern;

public class CityTemperature implements Temperature {

    private double celsius;

    public CityTemperature(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public double getTemperature() {
        return celsius;
    }
}