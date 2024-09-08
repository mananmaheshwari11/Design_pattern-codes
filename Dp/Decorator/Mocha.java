package Decorator;

public class Mocha extends CondimentDecorator{

    Beverage b;

    public Mocha(Beverage b){
        this.b = b;
        description = b.getDescription()+" Mocha ";
    }

    @Override
    public String getDescription(){
        return description;
    }

    @Override
    public double cost(){
        return b.cost() + 40;
    }
}
