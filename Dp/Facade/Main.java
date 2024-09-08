package Facade;

public class Main {
    public static void main(String[] args) {
        StreamFacade f=new StreamFacade(new UserAccount(), new PaymentProcess(), new Streamservice(), new MovieSelection());
        f.movieSelect("ikshit", "DDLJ", 300);
    }
}
