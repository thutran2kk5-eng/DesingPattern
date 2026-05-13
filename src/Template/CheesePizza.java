package Template;

public class CheesePizza extends PizzaTemplate {

    @Override
    void addToppings() {
        System.out.println("Adding cheese");
    }
}