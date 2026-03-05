package FactoryMethod;

public class Chocolate implements Candy {

    @Override
    public void produce() {
        System.out.println("Producing Chocolate Candy");
    }
}
