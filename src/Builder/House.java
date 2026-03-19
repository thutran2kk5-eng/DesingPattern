package Builder;


import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public String toString() {
        return "House has " + rooms.size() + " rooms: " + rooms;
    }
}