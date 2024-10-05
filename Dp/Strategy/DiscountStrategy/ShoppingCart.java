package Strategy.DiscountStrategy;

abstract public class ShoppingCart {
    DiscountStrategy disc=null;
    public void setDiscount(DiscountStrategy s){
        this.disc=s;
    }
    abstract public double calculateTotal(double amt);
}
