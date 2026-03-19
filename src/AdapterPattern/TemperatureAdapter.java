package AdapterPattern;

public class TemperatureAdapter implements Temperature {

    private USATemperature usaTemp;

    public TemperatureAdapter(USATemperature usaTemp) {
        this.usaTemp = usaTemp;
    }

    @Override
    public double getTemperature() {
        // chuyển F -> C
        return (usaTemp.getFahrenheit() - 32) * 5 / 9;
    }
}