package FactoryMethod;

public class Gummy implements Candy {

    @Override
    public void produce() {
        System.out.println("Producing Gummy Candy");
    }
}
