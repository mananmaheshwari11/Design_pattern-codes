package Decorator;

public class Whip extends CondimentDecorator{

    Beverage b;

    public Whip(Beverage b){
        this.b = b;
        description = b.getDescription()+" Whip ";
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public double cost(){
        return b.cost() + 50;
    }
    
}
