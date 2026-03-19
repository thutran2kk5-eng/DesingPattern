package Builder;

public class Room {
    private String type;

    public Room(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}