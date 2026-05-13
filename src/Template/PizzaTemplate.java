package Template;

public abstract class PizzaTemplate {

    public final void makePizza() {

        prepareDough();
        addSauce();
        addToppings();
        bake();
    }

    void prepareDough() {
        System.out.println("Preparing dough");
    }

    void addSauce() {
        System.out.println("Adding tomato sauce");
    }

    abstract void addToppings();

    void bake() {
        System.out.println("Baking pizza");
    }
}