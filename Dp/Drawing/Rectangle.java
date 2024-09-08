public class Rectangle implements Shapes {
    private int l,b;
    public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void display(){
        System.out.println("A ractangle of length and breadth"+l+","+b+"is created");
    }
    public Shapes clone(){
        try{
        return (Shapes)super.clone();
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
}
