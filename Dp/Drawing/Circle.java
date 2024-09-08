public class Circle implements Shapes {
    private int r;
    public Circle(int r){
        this.r=r;
    }
    public void display(){
        System.out.println("A circle"+r+"is created");
    }
    public Shapes clone(){
        try{
        return (Shapes)super.clone();
    }catch(Exception e){
        e.printStackTrace();
        return null;
    }
}
}
