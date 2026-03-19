package AdapterPattern;

public class Main {

    public static void main(String[] args) {

        // nhiệt độ hệ mình (Celsius)
        Temperature hcm = new CityTemperature(30);
        System.out.println("HCM: " + hcm.getTemperature() + " °C");

        // nhiệt độ từ Mỹ (Fahrenheit)
        USATemperature usa = new USATemperature(86);

        // dùng adapter
        Temperature usaAdapter = new TemperatureAdapter(usa);
        System.out.println("USA: " + usaAdapter.getTemperature() + " °C");
    }
}