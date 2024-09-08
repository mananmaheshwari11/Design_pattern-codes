
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Monster m;
        MonsterRegistry r = new MonsterRegistry();
        try{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the type of Monster");
        String s=sc.next();
        if (s.equalsIgnoreCase("Land")){
            r.registerMonster(s, new LandMonster());
        }
        else if(s.equalsIgnoreCase("Water")){
            r.registerMonster(s, new WaterMonster());
        }
        else if(s.equalsIgnoreCase("AIr")){
            r.registerMonster(s, new AirMonster());
        }
        System.out.println("Enter the monster you want to create");
        String name=sc.next();
        m=r.createMonster(name);
        m.display();
        sc.close();
    }
    catch(Exception e){
        System.out.println("Error");
    }
}

}
