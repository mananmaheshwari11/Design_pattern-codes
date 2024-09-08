public class ChicagoPizzaStore extends PizzaStore {
    Pizza pizza;
    @Override
    public Pizza createPizza(String type){
        if(type.equalsIgnoreCase("ChicagoSaadaPizza")){
            pizza=new ChicagoPizza();
        }
        else if(type.equalsIgnoreCase("ChicagoCheesePizza")){
            pizza=new CheesePizza();
        }
        else if(type.equalsIgnoreCase("ChicagoVeggiePizza")){
            pizza=new VeggiePizza("ChicagoVeggiePizza");
        }
        return pizza;
    }
}
