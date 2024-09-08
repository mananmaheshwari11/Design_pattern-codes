public class SimplePizzaFactory {
    Pizza pizza=null;
    public Pizza createPizza(String type){
        if(type.equalsIgnoreCase("Cheese")){
            pizza=new CheesePizza();
        }
        else if(type.equalsIgnoreCase("Veggie")){
            pizza=new VeggiePizza("Veggie pizza");
        }
        else if(type.equalsIgnoreCase("NewyorkPizza")){
            pizza=new NewyorkPizza();
        }
        else if(type.equalsIgnoreCase("chicagopizza")){
            pizza=new ChicagoPizza();
        }
        return pizza;
    }
}
