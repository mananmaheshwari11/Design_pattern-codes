package MenuSystem;

import java.util.ArrayList;

public class Submenu implements Menu{

    ArrayList<Menu> arr=new ArrayList<>();

    public void order(){
        System.out.println("The waiter is coming");
    } 
    public void addItem(Menu m){
        arr.add(m);
        System.out.println("Adding item"+m);
    }
    public void removeItem(Menu m){
        arr.add(m);
        System.out.println("Removing item"+m);
    }
    public void getItem(int i){
        Menu m=arr.get(i);
        System.out.println("Getting items"+m);
    }
}
