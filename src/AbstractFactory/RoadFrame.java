package AbstractFactory;

public class RoadFrame implements Frame {

    @Override
    public void createFrame() {
        System.out.println("Road bike frame created");
    }
}
