package Strategy.DiscountStrategy;

public class RegularCustomer extends ShoppingCart {
    public RegularCustomer(DiscountStrategy s){
        this.disc=s;
    }
    @Override
    public double calculateTotal(double amt) {
        double discount=disc.applyDiscount(amt);
        return amt-discount;
    }
    
}
