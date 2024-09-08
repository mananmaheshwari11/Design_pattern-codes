package AbstractFactory;

import java.util.Scanner;

public class Application {
    
    public static void main(String[] args) {
        GUIFactory factory;
        System.out.println("Enter the type of OS");
        Scanner sc=new Scanner(System.in);
        String f=sc.next();
        if (f.equalsIgnoreCase("Mac")){
            factory=new MacFactory();
        }
        else{
            factory=new WinFactory();
        }
        factory.makeButton().create();
        System.out.println(System.getProperty("os.name"));
        factory.makeCheckbox().createbox();
        sc.close();
        
    }
}
