package Template;

abstract public class Beverage {
    final void prepareRecipe(){
        boilWater();
        brew();
        pourIncup();
        addCondiments();
    }
    void boilWater(){
        System.out.println("Boiling the Water");
    }
    void pourIncup(){
        System.out.println("Pouring in the cup");
    }
    abstract void brew();
    abstract void addCondiments();
}

