package AbstractFactory;

public class MountainFrame implements Frame {

    @Override
    public void createFrame() {
        System.out.println("Mountain bike frame created");
    }
}
