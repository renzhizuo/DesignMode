package factory.absfactory.pizzastore.pizza;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDPepperPizza");
        System.out.println("LDPepperPizza Prepare");
    }
}
