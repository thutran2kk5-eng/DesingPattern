package DecoratorPattern;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new BasicPizza();

        // thêm cheese
        pizza = new Cheese(pizza);

        // thêm pepperoni
        pizza = new Pepperoni(pizza);

        System.out.println(pizza.getDescription());
        System.out.println("Total: $" + pizza.getCost());
    }
}