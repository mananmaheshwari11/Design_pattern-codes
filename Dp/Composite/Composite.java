package Composite;

import java.util.ArrayList;

public class Composite implements Component{

    ArrayList<Component> arr = new ArrayList<>();

    public void operation(){
        System.out.println("Operation is being performed on Composite...");
    }
    public void add(Component c){
        arr.add(c);
        System.out.println("Component added...");
    }
    public void remove(Component c){
        arr.remove(c);
        System.out.println("Component removed...");
    }
    public Component getChild(int i){
        return arr.get(i);
    }
}
