import java.util.Scanner;

public class MainPizza {
    public static void main(String[] args) {
        PizzaStore ps=null;
        String city;
        Scanner sc= new Scanner(System.in);
        city=sc.next();
        if (city.equalsIgnoreCase("NewYork")){
            ps=new NykPizzaStore();
        }
        else{
            ps=new ChicagoPizzaStore();
        }
        System.out.println("Which pizza you want");
        String pzz=sc.next();
        Pizza pizza=ps.createPizza(pzz);
        ps.orderPizza(pizza);
        sc.close();
    }
}
