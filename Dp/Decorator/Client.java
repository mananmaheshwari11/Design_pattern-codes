package Decorator;

// import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Beverage wme =new Whip(new Mocha(new Whip(new DarkRoast())));
        System.out.println(wme.getDescription());
        System.out.println(wme.cost());
    }
}
