package Builder;


public class HouseBuilder {

    private House house = new House();

    public HouseBuilder addRoom(Room room) {
        house.addRoom(room);
        return this;
    }

    public House build() {
        return house;
    }
}