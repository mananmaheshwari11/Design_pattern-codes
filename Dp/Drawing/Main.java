import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shapes s;
        ShapeRegistry r=new ShapeRegistry();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Shape You want to Register");
        System.out.println("1.Rectangle 2.Triangle 3.Circle");
        String name=sc.next();
        if (name.equalsIgnoreCase("Rectangle")){
            System.out.println("enter length");
            int l=sc.nextInt();
            System.out.println("enter width");
            int b=sc.nextInt();
            r.registerShape(name, new Rectangle(l, b));
        }
        else if(name.equalsIgnoreCase("Triangle")){
            System.out.println("enter side of equilateral triangle");
            int side=sc.nextInt();
            r.registerShape(name, new Triangle(side));
        }
        else if(name.equalsIgnoreCase("Circle")){
            System.out.println("enter the radius ");
            int rad=sc.nextInt();
            r.registerShape(name, new Circle(rad));
        }
        else{
            System.out.println("No shape defined");
        }

        System.out.println("want to create ??");
        String shape_name=sc.next();
        s=r.createShape(shape_name);
        System.out.println(s);
        s.display();
        sc.close();
    }
}
