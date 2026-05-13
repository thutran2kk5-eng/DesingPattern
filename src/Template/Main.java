package Template;

public class Main {

    public static void main(String[] args) {

        PizzaTemplate cheese = new CheesePizza();
        cheese.makePizza();

        System.out.println();

        PizzaTemplate seafood = new SeafoodPizza();
        seafood.makePizza();
    }
}
