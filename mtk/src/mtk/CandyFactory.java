package mtk;

public class CandyFactory {

    public static Candy createCandy(String type) {

        if (type.equalsIgnoreCase("chocolate")) {
            return new ChocolateCandy();
        }
        else if (type.equalsIgnoreCase("mint")) {
            return new MintCandy();
        }
        else {
            throw new IllegalArgumentException("Unknown candy type");
        }
    }
}
