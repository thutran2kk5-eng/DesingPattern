package AbstractFactory;

public class BikeStore {

    private Wheel wheel;
    private Frame frame;

    public BikeStore(BikeFactory factory) {

        wheel = factory.createWheel();
        frame = factory.createFrame();
    }

    public void assemble() {

        wheel.createWheel();
        frame.createFrame();

        System.out.println("Bike assembled");
    }
}