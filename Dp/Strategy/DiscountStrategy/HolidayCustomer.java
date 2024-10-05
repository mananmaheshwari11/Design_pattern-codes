package Strategy.DiscountStrategy;

public class HolidayCustomer extends ShoppingCart {
    public HolidayCustomer(DiscountStrategy s){
        this.disc=s;
    }
    @Override
    public double calculateTotal(double amt) {
        double discount=disc.applyDiscount(amt);
        return amt-discount;
    }
    
}
