package Strategy.DiscountStrategy;

public class PremiumCustomer extends ShoppingCart {
    public PremiumCustomer(DiscountStrategy s){
        this.disc=s;
    }
    @Override
    public double calculateTotal(double amt) {
        double discount=disc.applyDiscount(amt);
        return amt-discount;
    }
    
}
