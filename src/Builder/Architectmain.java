package Builder;

public class Architectmain {
    public static void main(String[] args) {

        // ===== a. Tạo Bedroom =====
        Bedroom bedroom = new BedroomBuilder()
                .setBedType("King")
                .setColor("White")
                .setHasAC(true)
                .setHasTV(true)
                .setNumberOfWindows(2)
                .setHasWardrobe(true)
                .setSize(35.5)
                .build();

        System.out.println(bedroom);

        // ===== c. Tạo House =====
        Room bedRoom = new Room("Bedroom");
        Room kitchen = new Room("Kitchen");
        Room livingRoom = new Room("Living Room");

        House house = new HouseBuilder()
                .addRoom(bedRoom)
                .addRoom(kitchen)
                .addRoom(livingRoom)
                .build();

        System.out.println(house);
    }
}