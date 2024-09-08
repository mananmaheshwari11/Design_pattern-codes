package Chocolate;

public class ChocoMain {
    public static void main(String[] args) {
        ChocolateBoiler cb1 = ChocolateBoiler.getBoiler();
        //System.out.println(cb1);
        ChocolateBoiler cb2 = ChocolateBoiler.getBoiler();
        //System.out.println(cb2);
        if(cb1.toString().equals(cb2.toString())){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
