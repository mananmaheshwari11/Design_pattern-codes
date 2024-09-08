public class NykPizzaStore extends PizzaStore {
    Pizza pizza;
    @Override
    public Pizza createPizza(String type){
        if(type.equalsIgnoreCase("NewyorkSaadaPizza")){
            pizza=new NewyorkPizza();
        }
        else if(type.equalsIgnoreCase("NewyorkCheesePizza")){
            pizza=new CheesePizza();
        }
        else if(type.equalsIgnoreCase("NewYorkVeggiePizza")){
            pizza=new VeggiePizza("NewYorkVeggiePizza");
        }
        return pizza;
    }
}
