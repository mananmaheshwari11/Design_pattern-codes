public abstract class PizzaStore {
    public abstract Pizza createPizza(String type);
    public void orderPizza(Pizza pizza){
        System.out.println("Your order is being placed....");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("Your Pizza is ready! Have a nice day!");
        }
}
