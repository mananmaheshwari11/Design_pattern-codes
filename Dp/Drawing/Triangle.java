public class Triangle implements Shapes{
    private int side;
    public Triangle(int side){
        this.side=side;        
    }
    public void display(){
        System.out.println("A triangle of side"+side+"cm created");
    }
    public Shapes clone(){
        try {
            return (Shapes)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
