package FactoryMethod;
public class Main {

    public static void main(String[] args) {

        CandyStore store = new CandyStore();

        store.orderCandy("chocolate");
        store.orderCandy("caramel");
        store.orderCandy("gummy");
    }
}
