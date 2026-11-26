import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // System.out.println("-----Circle-----");
        // double r = read.nextDouble();

        // double area;
        
        // area = 3.14*r*r;

        // System.out.println("Circle Area:" + area);


        // System.out.println("-----Rectangle-----");
        // double l = read.nextDouble();
        // double b = read.nextDouble();
        // area = l*b;
        // System.out.println("Rectange Area: "+area);

        //  System.out.println("-----Trinagle-----");
        // double br = read.nextDouble();
        // double h = read.nextDouble();
        // area = 0.5*br*h;
        // System.out.println("Triangle Area: "+area);


        System.out.println("Enter the Shape Name:");
        System.out.println("Circle");
        System.out.println("Rectangle");
        System.out.println("Triangle");
        String name = read.next();
        double area;

        switch (name) {
            case "Circle":
                System.out.println("You choose: " + name +" shape");
                System.out.println("Enter the Radius Value: ");
                double r = read.nextDouble();
                area = 3.14*r*r;
                System.out.println("Area of circle: "+ area);
                break;

            case "Rectangle":
                System.out.println("You choose: " + name +" shape");
                System.out.println("Enter the Length Value: ");
                double l = read.nextDouble();
                System.out.println("Enter the Breath Value: ");
                double b = read.nextDouble();
                area = l*b;
                System.out.println("Area of reactangle: "+ area);
                break;

            case "Triangle":
                System.out.println("You choose: " + name +" shape");
                System.out.println("Enter the Breath Value: ");
                double br = read.nextDouble();
                System.out.println("Enter the Hight Value: ");
                double h = read.nextDouble();
                area = 0.5*br*h;
                System.out.println("Area of triangle: "+ area);
                break;
        
            default:
                System.out.println("Invalid");
        }

    }
}
