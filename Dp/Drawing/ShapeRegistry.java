import java.util.HashMap;

public class ShapeRegistry {
    HashMap<String,Shapes>shape=new HashMap<>();
    public void registerShape(String s, Shapes shapes){
        shape.put(s,shapes);
    }
    public Shapes createShape(String s){
        return shape.get(s);
    }
}
