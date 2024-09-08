
import java.util.HashMap;

public class MonsterRegistry {
    HashMap <String,Monster> h1=new HashMap<>();
    public void registerMonster(String name,Monster m){
        h1.put(name, m);
    }

    public Monster createMonster(String name){
        try {
        return h1.get(name).clone();
        } catch (Exception e) {
            System.out.println("No such monster available");
            return null;
        }
    }
}
