package AbstractFactory;

public class RoadBikeFactory implements BikeFactory {

    @Override
    public Wheel createWheel() {
        return new RoadWheel();
    }

    @Override
    public Frame createFrame() {
        return new RoadFrame();
    }
}
