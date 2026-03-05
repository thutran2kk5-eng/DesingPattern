package AbstractFactory;

public class MountainWheel implements Wheel {

    @Override
    public void createWheel() {
        System.out.println("Mountain bike wheel created");
    }
}