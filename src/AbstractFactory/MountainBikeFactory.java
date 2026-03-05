package AbstractFactory;

public class MountainBikeFactory implements BikeFactory {

    @Override
    public Wheel createWheel() {
        return new MountainWheel();
    }

    @Override
    public Frame createFrame() {
        return new MountainFrame();
    }
}
