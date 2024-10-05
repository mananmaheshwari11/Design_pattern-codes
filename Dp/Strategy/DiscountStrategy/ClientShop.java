package Strategy.DiscountStrategy;

public class ClientShop {
    public static void main(String[] args) {
        ShoppingCart cust1=new RegularCustomer(new RegularDisc());
        ShoppingCart cust2=new PremiumCustomer(new RegularDisc());
        ShoppingCart cust3=new HolidayCustomer(new HolidayDisc());
        System.out.println(cust1.calculateTotal(1000));
        System.out.println(cust2.calculateTotal(1000));
        System.out.println(cust3.calculateTotal(1000));
        cust2.setDiscount(new PremiumDisc());
        System.out.println(cust2.calculateTotal(1000));
    }
}
