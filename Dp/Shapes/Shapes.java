public class Shapes{
    public static void main(String[] args) {
        Triangle t=new Triangle(5, 4);
       float x= t.calcarea();
        Circle c=new Circle(14);
        double y=c.calcarea();
        Rectangle r=new Rectangle(5, 4);
        float z=r.calcarea();
        System.out.println(x +","+y+","+z);
        System.out.println(y);
        System.out.println(z);
    }
}

class Triangle extends Shapes{
    float height,base;
    public Triangle(float b,float h){
        this.height=h;
        this.base=b;
    }
    public float calcarea(){
        return(height*base)/2;
    }
}

class Circle extends Shapes{
    double radius;
    public Circle(float r){
        this.radius=r;
    }
    public double calcarea(){
        return(3.14*radius*radius);
    }
}

class Rectangle extends Shapes{
    float height,base;
    public Rectangle(float b,float h){
        this.height=h;
        this.base=b;
    }
    public float calcarea(){
        return(height*base);
    }
}