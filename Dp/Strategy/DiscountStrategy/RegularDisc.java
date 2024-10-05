package Strategy.DiscountStrategy;

public class RegularDisc implements DiscountStrategy {
    public double applyDiscount(double amt){
        return 0.1*amt;
    }
}
