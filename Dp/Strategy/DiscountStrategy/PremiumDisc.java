package Strategy.DiscountStrategy;

public class PremiumDisc implements DiscountStrategy{
    public double applyDiscount(double amt){
        return 0.2*amt;
    }
}
