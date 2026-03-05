package AbstractFactory;

public class Main {

    public static void main(String[] args) {

        BikeFactory mountainFactory = new MountainBikeFactory();
        BikeStore mountainBike = new BikeStore(mountainFactory);

        mountainBike.assemble();

        System.out.println("------");

        BikeFactory roadFactory = new RoadBikeFactory();
        BikeStore roadBike = new BikeStore(roadFactory);

        roadBike.assemble();
    }
}