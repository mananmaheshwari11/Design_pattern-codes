package LaptopBuild;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopBuilder lb=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Which laptop do you want?");
        String input=sc.nextLine();
        if(input.equalsIgnoreCase("Gaming")){
            lb=new GamingLaptop();
        }
        else if(input.equalsIgnoreCase("Working")){
            lb=new WorkLaptop();
        }
        System.out.println("Enter Ram size");
        String ram=sc.nextLine();
        System.out.println("Enter Processor");
        String p=sc.nextLine();
        System.out.println("Enter Touch type");
        String touch=sc.nextLine();
        System.out.println("Enter screen type");
        String screen=sc.nextLine();

        Director d=new Director(lb);
        d.construct(ram, p, touch, screen);
        Laptop l=d.geLaptop();
        System.out.println("created Laptop with"+l.ram+"GB Ram, "+l.processor+" processor, "+l.touchPad+", and"+l.screen+"display !");
    sc.close();
    }
}
