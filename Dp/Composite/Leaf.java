package Composite;

public class Leaf implements Component{
    public void operation(){
        System.out.println("Operation is being performed on Leaf...");
    }
    public void add(Component c){
        throw new UnsupportedOperationException("You cannot add in a leaf...");
    }
    public void remove(Component c){
        throw new UnsupportedOperationException("You cannot remove in a leaf...");
    }
    public Component getChild(int i){
        throw new UnsupportedOperationException("Leaf does not have a child...");
    }
}
