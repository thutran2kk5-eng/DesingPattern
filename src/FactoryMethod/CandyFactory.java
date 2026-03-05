package FactoryMethod;

public class CandyFactory {

    public static Candy createCandy(String type) {

        if (type.equalsIgnoreCase("chocolate")) {
            return new Chocolate();
        }

        if (type.equalsIgnoreCase("caramel")) {
            return new Caramel();
        }

        if (type.equalsIgnoreCase("gummy")) {
            return new Gummy();
        }

        return null;
    }
}
