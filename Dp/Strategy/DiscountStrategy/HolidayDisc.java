package Strategy.DiscountStrategy;

public class HolidayDisc implements DiscountStrategy {
    public double applyDiscount(double amt){
        return 0.3*amt;
    }
}
