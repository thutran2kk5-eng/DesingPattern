package AbstractFactory;

public class RoadWheel implements Wheel {

    @Override
    public void createWheel() {
        System.out.println("Road bike wheel created");
    }
}
