package FactoryMethod;

public class CandyStore {

    public void orderCandy(String type) {

        Candy candy = CandyFactory.createCandy(type);

        if (candy != null) {
            candy.produce();
        } else {
            System.out.println("Candy type not available");
        }
    }
}
